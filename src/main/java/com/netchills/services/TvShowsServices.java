package com.netchills.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.netchills.dao.TvShowsRepository;
import com.netchills.dao.UsersRepository;
import com.netchills.model.TvShows;
import com.netchills.model.User;

@Service
public class TvShowsServices {

	@Autowired
	TvShowsRepository tvShowsRepository;
	
	public List<TvShows> getAllTvShows(){
		return tvShowsRepository.findAll();
	}
	
	public List<TvShows> getAllTvShowsFeatured(){
		return tvShowsRepository.findAllByIsFeatured(1);
	}
	
	
	public Optional<TvShows> getTvShowById(String id){
		return tvShowsRepository.findById(id);
	}
}
