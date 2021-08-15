package com.netchills.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.netchills.model.User;

public interface UsersRepository extends MongoRepository<User, String> {
	  User findByEmail(String username);
}