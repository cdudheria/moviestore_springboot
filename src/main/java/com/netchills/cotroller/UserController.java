package com.netchills.cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.netchills.dao.UsersRepository;
import com.netchills.model.LoginRequest;
import com.netchills.model.User;
import com.netchills.services.UserServices;
@RestController
public class UserController {

	@Autowired
	UsersRepository userRepository;

	@Autowired
	UserServices userServices;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	
	@PostMapping("/signinWithAuth")
	public ResponseEntity<?> authenticateUser(@RequestBody LoginRequest loginRequest) {
		try {
			 User user = userRepository.findByEmail(loginRequest.getEmail());
			 if(user.getPassword().equals(passwordEncoder.encode(loginRequest.getPassword()))) {
				 return ResponseEntity.ok("success");
			 }else {
				 return ResponseEntity.ok("fail");
			 }
		}catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.ok().body("failed!");
		}
		
	}
	
	@GetMapping("/users/{email}")
	public ResponseEntity<User> Register(@PathVariable String email) {
		 User user = userRepository.findByEmail(email);
	return ResponseEntity.ok().body(user);	
	}
	
	@PostMapping("/insertUser")
	public ResponseEntity<String> saveUser(@RequestBody User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		 userServices.saveUser(user);
	return ResponseEntity.ok().body("saved successfully");	
	}
	
	
	
	
}
