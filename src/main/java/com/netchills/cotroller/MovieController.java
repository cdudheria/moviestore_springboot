package com.netchills.cotroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.netchills.model.Movies;
import com.netchills.services.MoviesServices;
@RestController
public class MovieController {

	@Autowired
	MoviesServices moviesServices;
	
	@GetMapping("/getAllMovies")
	public ResponseEntity<?> allMovies() {
		List<Movies> list = moviesServices.getAllMovies();
	return ResponseEntity.ok().body(list);	
	}
	

	@GetMapping("/getAllFeaturedMovies")
	public ResponseEntity<?> allFeaturedMovies() {
		List<Movies> list = moviesServices.getAllMoviesFeatured();
	return ResponseEntity.ok().body(list);	
	}
	
	@GetMapping("/getmovie/{name}")
	public ResponseEntity<?> getMovieById(@PathVariable String name) {
		 Optional<Movies>  list = moviesServices.getMoviesById(name);
	return ResponseEntity.ok().body(list);	
	}
	
}
