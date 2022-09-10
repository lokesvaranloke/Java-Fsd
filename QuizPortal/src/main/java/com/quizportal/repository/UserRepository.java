package com.quizportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quizportal.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	public User findUserByName(String name);
}
