package com.movieapp.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.logging.Logger;

@Controller
    public class MovieController {

    private final Logger log = Logger.getLogger(MovieController.class.getName());

    private MovieAppRep movieAppRep;

    @GetMapping("/")
    public String Index(Model model) {
        log.info("Index Called");

        List<Movies> movie = movieAppRep.ListAll();

        model.addAttribute("movies", movie);

        return "index";
    }
}