package com.quizportal.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quizportal.entity.Result;
import com.quizportal.entity.Test;
import com.quizportal.entity.User;
import com.quizportal.repository.QuestionRepository;
import com.quizportal.repository.TestRepository;
import com.quizportal.repository.UserRepository;

@Service
public class TestService {

	@Autowired
	TestRepository trepo;
	
	@Autowired
	UserRepository urepo;
	
	@Autowired
	QuestionRepository qrepo;

	public String userTakeTest(Test test) {
		if(test!=null) {
			trepo.save(test);
			return "Test Submitted Successfully";
		} else {
			return "Test Not Submitted";
		}
	}

	public List<Test> getAllTest() {
		return trepo.findAll();
	}

	public List<Result> result() {
		List<Result> finalList=new ArrayList<>();
		String email="";
		int mark=0;
		List<Test> test = trepo.findAll();
		List<User> user = urepo.findAll();
		
		for(User u:user) {
			mark=0;
			email=u.getEmail();
			System.out.println(u.getEmail());
			
			for(Test t: test) {
				if(u.getUid()==t.getUserid().getUid()) {
					if(t.getTestans()==(t.getQuestionid().getAns())) {
						mark++;
					}
				}
			}
			
			finalList.add(new Result(email, mark));
		}
		
		Collections.sort(finalList);
		return finalList;
	}
}
