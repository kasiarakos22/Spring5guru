package com.kasiarakos.chuckborrisapp.controllers;

import com.kasiarakos.chuckborrisapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    JokeService jokeService;

    @Autowired
    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping(value = "/")
    public String getJokes(Model model){
        model.addAttribute("joke" , jokeService.getJoke());
        return "chucknorris";
    }

}
