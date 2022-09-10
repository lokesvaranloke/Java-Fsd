package com.quizportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.quizportal.entity.Quiz;
import com.quizportal.service.QuizService;

@RestController
public class QuizController {

	@Autowired
	QuizService quservice;
	
	@PostMapping(value = "/addquiz")
	public String addQuiz(@RequestBody Quiz quiz) {
		return quservice.saveQuiz(quiz);
	}
	
	@GetMapping(value = "/viewallquiz")
	public List<Quiz> viewAllQuiz() {
		return quservice.getAllQuiz();
	}
	
	@GetMapping(value = "/userviewallquiz")
	public List<Object> userViewAllQuiz(){
		return quservice.getUserAllQuiz();
	}
}
