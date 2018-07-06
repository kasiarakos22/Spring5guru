package com.kasiarakos.spring5webapp.bootstrap;

import com.kasiarakos.spring5webapp.model.Author;
import com.kasiarakos.spring5webapp.model.Book;
import com.kasiarakos.spring5webapp.repositories.AuthorRepository;
import com.kasiarakos.spring5webapp.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {


    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    @Autowired
    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    private void initData(){

        Author kasiarakos  = new Author("Dimitris", "Kasiaras");
        Book kasBook = new Book("Domain Driven Design", "1234", "Harper Collins");
        kasiarakos.getBooks().add(kasBook);
        kasBook.getAuthors().add(kasiarakos);

        Author karka = new Author("Sofia", "Karka");
        Book karkaBook = new Book("J2EE Development without EJB", "2345", "Worx");
        karka.getBooks().add(karkaBook);
        karkaBook.getAuthors().add(karka);

        authorRepository.save(karka);
        authorRepository.save(kasiarakos);
        bookRepository.save(karkaBook);
        bookRepository.save(karkaBook);

    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }
}
