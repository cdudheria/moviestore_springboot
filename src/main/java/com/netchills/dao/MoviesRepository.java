package com.netchills.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.netchills.model.Movies;
import com.netchills.model.TvShows;
import com.netchills.model.User;

public interface MoviesRepository extends MongoRepository<Movies, String> {
	List<Movies> findAllByIsFeatured(int featured);
}