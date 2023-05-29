package com.mov.movlist.services;

import com.mov.movlist.entities.Movie;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface LService {
    Movie saveMovie(Movie movie);
    Movie updateMovie(Movie movie);
    Movie getMovie(Long id);
    List<Movie> getAllMovies();
    void deleteMovieById(Long id);
    void deleteAllMovies();
}
