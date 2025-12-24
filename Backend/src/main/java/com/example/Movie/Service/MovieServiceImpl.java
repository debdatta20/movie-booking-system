package com.example.Movie.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Movie.Entity.Movie;
import com.example.Movie.Repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    //Admin: Helps to add movies
    @Override
    public Movie addMovie(Movie movie) {
       return movieRepository.save(movie);
    }


    //User+Admin: Helps to view all movies
    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
       
    }
    
}
