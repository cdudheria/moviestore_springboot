package com.netchills.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.netchills.dao.MoviesRepository;
import com.netchills.dao.TvShowsRepository;
import com.netchills.dao.UsersRepository;
import com.netchills.model.Movies;
import com.netchills.model.TvShows;
import com.netchills.model.User;

@Service
public class MoviesServices {

	@Autowired
	MoviesRepository moviesRepository;
	
	public List<Movies> getAllMovies(){
		return moviesRepository.findAll();
	}
	
	public List<Movies> getAllMoviesFeatured(){
		return moviesRepository.findAllByIsFeatured(1);
	}
	
	public Optional<Movies> getMoviesById(String id){
		return moviesRepository.findById(id);
	}
	
}
