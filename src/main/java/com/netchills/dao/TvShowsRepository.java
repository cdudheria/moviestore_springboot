package com.netchills.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.netchills.model.TvShows;
import com.netchills.model.User;

public interface TvShowsRepository extends MongoRepository<TvShows, String> {

	 List<TvShows> findAllByIsFeatured(int featured);
}