package com.klu.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klu.model.Login;

@Repository
public interface LoginRepo extends JpaRepository<Login, String>{
	
	public Login findByUsername(String username);
	

}
