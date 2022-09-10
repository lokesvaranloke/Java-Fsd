package com.quizportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quizportal.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{

}
