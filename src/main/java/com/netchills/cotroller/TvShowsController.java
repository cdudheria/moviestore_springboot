package com.netchills.cotroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.netchills.model.TvShows;
import com.netchills.services.TvShowsServices;
@RestController
@CrossOrigin(origins = "http://localhost:3300",allowedHeaders = "*")
public class TvShowsController {

	@Autowired
	TvShowsServices tvShowsServices;
	
	@GetMapping("/GetAllFeaturedTvShows")
	public ResponseEntity<?> allFeaturedTvShows() {
		List<TvShows> list = tvShowsServices.getAllTvShowsFeatured();
	return ResponseEntity.ok().body(list);	
	}
	
	@GetMapping("/gettvshow/{name}")
	public ResponseEntity<?> getTvShow(@PathVariable String name) {
		 Optional<TvShows>  list = tvShowsServices.getTvShowById(name);
	return ResponseEntity.ok().body(list);	
	}
	
	@GetMapping("/getALLTvShows")
	public ResponseEntity<?> allTvShows() {
		List<TvShows> list = tvShowsServices.getAllTvShows();
	return ResponseEntity.ok().body(list);	
	}
	
	
}
