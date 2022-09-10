package com.quizportal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quizportal.entity.Question;
import com.quizportal.repository.QuestionRepository;

@Service
public class QuestionService {

	@Autowired
	QuestionRepository qrepo;

	public String saveQuestion(Question question) {
		if(question!=null) {
			qrepo.save(question);
			return "Question Added Successfully";
		} else {
			return "Question Not Added";
		}
	}

	
	
}
