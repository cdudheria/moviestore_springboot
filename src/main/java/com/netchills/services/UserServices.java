package com.netchills.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.netchills.dao.UsersRepository;
import com.netchills.model.User;

@Service
public class UserServices {

	@Autowired
	UsersRepository usersRepository;
	
	@Transactional(rollbackFor = Exception.class)
	public void saveUser(User user) {
		User u = usersRepository.save(user);
	} 
	
}
