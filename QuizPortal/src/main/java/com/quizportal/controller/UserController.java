package com.quizportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.quizportal.entity.User;
import com.quizportal.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService uservice;
	
	@PostMapping(value = "/userregister")
	public String userRegistration(@RequestBody User user) {
		return uservice.saveUser(user);
	}
	
	@PostMapping(value = "/userlogin")
	public String userLogin(@RequestBody User user) {
		return uservice.checkUser(user.getName(),user.getPassword());
	}
}
