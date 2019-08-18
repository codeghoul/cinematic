package me.jysh.cinematic.controller;

import me.jysh.cinematic.model.Movie;
import me.jysh.cinematic.model.Screening;
import me.jysh.cinematic.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class MovieController {
    private MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public ResponseEntity<?> getAllMovies() {
        List<Movie> movies = movieService.getAllMovies();
        return ResponseEntity.status(HttpStatus.OK).body(movies);
    }

    @GetMapping("/movies/{movie_id}")
    public ResponseEntity<?> getMovieById(@PathVariable Long movie_id) {
        Movie movie = movieService.getMovieById(movie_id);
        return ResponseEntity.status(HttpStatus.OK).body(movie);
    }

    @GetMapping("/movies/{movie_id}/screenings")
    public ResponseEntity<?> getAllScreeningByMovieId(@RequestParam(name = "date", required = false) String date, @PathVariable Long movie_id) {
        List<Screening> screenings;
        if (date != null) {
            LocalDate localDate = LocalDate.parse(date);
            screenings = movieService.getAllScreeningByMovieIdAndDate(movie_id, localDate);
        } else {
            screenings = movieService.getAllScreeningByMovieId(movie_id);
        }
        return ResponseEntity.status(HttpStatus.OK).body(screenings);
    }

    @DeleteMapping("/movies/{movie_id}")
    public ResponseEntity<?> deleteMovieById(@PathVariable Long movie_id) {
        movieService.deleteMovie(movie_id);
        return ResponseEntity.noContent().build();
    }
}

