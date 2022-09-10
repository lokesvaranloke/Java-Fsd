package com.quizportal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quizportal.entity.Admin;
import com.quizportal.repository.AdminRepository;

@Service
public class AdminService {

	@Autowired
	AdminRepository adrepo;
	
	public String checkAdmin(Admin admin) {
		Admin ad = adrepo.findById(1).get();
		
		if(admin.getName().equals(ad.getName())&&admin.getPassword().equals(ad.getPassword())) {
			return "Admin Login Successfull";
		} else {
			return "Admin Credentials Failed";
		}
	}

	public String updateAdmin(Admin admin) {
		Admin ad = adrepo.findById(1).get();
		ad.setName(admin.getName());
		ad.setPassword(admin.getPassword());
		adrepo.save(ad);
		return "Admin Updated";
	}
}
