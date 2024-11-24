package com.klu.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klu.model.Laptops;

@Repository
public interface LaptopsRepo extends JpaRepository<Laptops, Long> {
	
	public Laptops findByPid(Long pid);

}
