package com.movieapp.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MovieAppRep {

    private ArrayList<Movies> movie = new ArrayList<>();

    public MovieAppRep(){

        movie.add(new Movies("Deadpool", "Superheroes", "2:30", 2016));
        movie.add(new Movies("LOTR", "Adventure", "3", 2000));
        movie.add(new Movies("Interstellar", "Scify", "2:30", 2015));
        movie.add(new Movies("Avatar", "Scify", "2:45", 2012));
    }

    public List<Movies> ListAll(){
        return movie;
    }
}
