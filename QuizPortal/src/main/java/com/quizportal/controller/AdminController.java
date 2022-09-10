package com.quizportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.quizportal.entity.Admin;
import com.quizportal.service.AdminService;

@RestController
public class AdminController {

	@Autowired
	AdminService adservice;
	
	@PostMapping(value = "/adminlogin")
	public String adminLogin(@RequestBody Admin admin) {
		return adservice.checkAdmin(admin);
	}
	
	@PostMapping(value = "/adminupdate")
	public String adminUpdate(@RequestBody Admin admin) {
		return adservice.updateAdmin(admin);
	}
}
