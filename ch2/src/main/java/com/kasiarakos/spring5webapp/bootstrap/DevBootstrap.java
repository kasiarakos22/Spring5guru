package com.kasiarakos.spring5webapp.bootstrap;

import com.kasiarakos.spring5webapp.model.Author;
import com.kasiarakos.spring5webapp.model.Book;
import com.kasiarakos.spring5webapp.model.Publisher;
import com.kasiarakos.spring5webapp.repositories.AuthorRepository;
import com.kasiarakos.spring5webapp.repositories.BookRepository;
import com.kasiarakos.spring5webapp.repositories.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {


    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    @Autowired
    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository , PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    private void initData(){

        Author kasiarakos  = new Author("Dimitris", "Kasiaras");
        Publisher publisher = new Publisher("psyxogios", "kifisias 65");
        Book kasBook = new Book("Domain Driven Design", "1234", publisher);
        kasiarakos.getBooks().add(kasBook);
        kasBook.getAuthors().add(kasiarakos);

        Author karka = new Author("Sofia", "Karka");
        Book karkaBook = new Book("J2EE Development without EJB", "2345", publisher);
        karka.getBooks().add(karkaBook);
        karkaBook.getAuthors().add(karka);


        publisherRepository.save(publisher);
        authorRepository.save(karka);
        authorRepository.save(kasiarakos);
        bookRepository.save(kasBook);
        bookRepository.save(karkaBook);

    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }
}
