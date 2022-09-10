package com.quizportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quizportal.entity.Quiz;
import com.quizportal.repository.QuizRepository;

@Service
public class QuizService {

	@Autowired
	QuizRepository qurepo;

	public String saveQuiz(Quiz quiz) {
		if(quiz!=null) {
			qurepo.save(quiz);
			return "Quiz Added Successfully";
		} else {
			return "Quiz Not Added";
		}
	}

	public List<Quiz> getAllQuiz() {
		return qurepo.findAll();
	}

	public List<Object> getUserAllQuiz() {
		return qurepo.listOfUserQuiz();
	}
}
