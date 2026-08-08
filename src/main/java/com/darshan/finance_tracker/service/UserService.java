package com.darshan.finance_tracker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.darshan.finance_tracker.dto.RegisterRequest;
import com.darshan.finance_tracker.entity.User;
import com.darshan.finance_tracker.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public String register(RegisterRequest request) {
		if(userRepository
				.findByEmail(request.getEmail())
				.isPresent()) {
				return "Email already exists";
				}
		
		User user=new User();
		
		user.setName(request.getName());
		user.setEmail(request.getEmail());
		user.setPassword(passwordEncoder.encode(request.getPassword()));
		
		userRepository.save(user);
		
		return "User Registered Sucessfully";
	}
	
}
