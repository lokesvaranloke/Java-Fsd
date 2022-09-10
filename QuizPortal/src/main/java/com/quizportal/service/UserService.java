package com.quizportal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quizportal.entity.User;
import com.quizportal.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository urepo;

	public String saveUser(User user) {
		if (urepo.findUserByName(user.getName()) == null) {
			urepo.save(user);
			return "User Register Successfully";
		} else {
			return "User Already Exists";
		}
	}

	public String checkUser(String name, String password) {
		User us = urepo.findUserByName(name);
		if (us != null) {
			if (us.getName().equals(name) && us.getPassword().equals(password)) {
				return "User Login Successfull";
			} else {
				return "Invalid User Credentials";
			}
		} else {
			return "User Not Found";
		}
	}
}
