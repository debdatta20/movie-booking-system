package com.example.Movie.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Movie.Entity.Movie;


@Service
public interface MovieService {

    //Add movie(Admin)
    Movie addMovie(Movie movie);
    List<Movie> getAllMovies();
    
}
