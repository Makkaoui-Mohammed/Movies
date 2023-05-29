package com.mov.movlist.controllers;

import com.mov.movlist.entities.Movie;
import com.mov.movlist.repositories.MovieRepository;
import com.mov.movlist.services.LService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class MovieController {



    @Autowired
    LService lService;
    @RequestMapping("/createMovie")
    public  String createMovie(){
        return "CreateMovie";
    }
    @RequestMapping("/saveMovie")
    public  String saveMovie(
            @ModelAttribute ("movie") Movie movie) {
        Movie memo = lService.saveMovie(movie);
        return "CreateMovie";
    }
    @RequestMapping("/movieList")
    public String movieList(ModelMap modelMap){
        List<Movie> moviesController=lService.getAllMovies();
        modelMap.addAttribute("movieJsp",moviesController);
        return "MovieList";

    }
    @RequestMapping("/deleteMovie")
    public String deleteMovie(@RequestParam("id") Long id,ModelMap modelMap ){
        lService.deleteMovieById(id);
        List<Movie> moviesController=lService.getAllMovies();
        modelMap.addAttribute("movieJsp",moviesController);
        return "MovieList";
    }
    @RequestMapping("/showMovie") /*xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx*/
    public String showMovie(@RequestParam("id") Long id,ModelMap modelMap){
        Movie movieController = lService.getMovie(id);
        modelMap.addAttribute("movieJsp",movieController);
        return "EditMovie";
    }
    @RequestMapping("/UpdateMovie")  /*xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx*/
    public  String updateMovie(@ModelAttribute ("movie") Movie movie)
    {
        Movie memo = lService.saveMovie(movie);
        return "CreateMovie";
    }
}