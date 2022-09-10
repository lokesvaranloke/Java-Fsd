package com.quizportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quizportal.entity.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer>{

}
