package com.mov.movlist.services;

import com.mov.movlist.entities.Movie;
import com.mov.movlist.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LServiceImpl implements LService {
    @Autowired
    MovieRepository movieRepository;
    @Override
    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public Movie updateMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public Movie getMovie(Long id) {
        return movieRepository.findById(id).get();
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }


    @Override
    public void deleteMovieById(Long id) {
        movieRepository.deleteById(id);

    }

    @Override
    public void deleteAllMovies() {
        movieRepository.deleteAll();

    }
}
