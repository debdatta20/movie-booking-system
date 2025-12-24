package com.example.Movie.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Movie.Entity.Movie;
import com.example.Movie.Service.MovieService;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    //Add movie (Admin)
    @PostMapping
    public Movie addMovie(@RequestBody Movie movie){
       return movieService.addMovie(movie); 
    }

    @GetMapping
    public List<Movie>getMovies(){
        return movieService.getAllMovies();
    }
    
}
