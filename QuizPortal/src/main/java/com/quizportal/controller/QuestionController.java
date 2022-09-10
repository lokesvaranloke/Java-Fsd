package com.quizportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.quizportal.entity.Question;
import com.quizportal.service.QuestionService;

@RestController
public class QuestionController {

	@Autowired
	QuestionService qservice;
	
	@PostMapping(value = "/addquestion")
	public String addQuestion(@RequestBody Question question) {
		return qservice.saveQuestion(question);
	}
}
