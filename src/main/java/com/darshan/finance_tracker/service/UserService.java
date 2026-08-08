package com.darshan.finance_tracker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darshan.finance_tracker.dto.RegisterRequest;
import com.darshan.finance_tracker.entity.User;
import com.darshan.finance_tracker.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public String register(RegisterRequest request) {
		User user=new User();
		
		user.setName(request.getName());
		user.setEmail(request.getEmail());
		user.setPassword(request.getPassword());
		
		userRepository.save(user);
		
		return "User Registered Sucessfully";
	}
	
}
