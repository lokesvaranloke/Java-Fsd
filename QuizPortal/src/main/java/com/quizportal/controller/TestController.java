package com.quizportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.quizportal.entity.Result;
import com.quizportal.entity.Test;
import com.quizportal.service.TestService;

@RestController
public class TestController {

	@Autowired
	TestService tservice;
	
	@PostMapping(value = "/usertaketest")
	public String userTakeTest(@RequestBody Test test) {
		return tservice.userTakeTest(test);
	}
	
	@GetMapping(value = "/admingetalltest")
	public List<Test> getAllTest() {
		return tservice.getAllTest();
	}
	
	@GetMapping(value = "/getresult")
	public List<Result> getResult(){
		return tservice.result();
	}
	
	@GetMapping(value = "/getadminresult")
	public List<Result> getAdminResult()
	{
			return tservice.result();
	}
	
	
}
