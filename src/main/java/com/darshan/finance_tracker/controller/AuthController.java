package com.darshan.finance_tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.darshan.finance_tracker.dto.RegisterRequest;
import com.darshan.finance_tracker.service.UserService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
	
	@GetMapping("/test")
	public String test() {
	
	return "Application Running";
	
	}
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
	public String register(
			@RequestBody RegisterRequest request) {
		return userService.register(request);
	}
	
}
