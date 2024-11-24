package com.klu.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klu.model.Mobiles;

@Repository
public interface MobilesRepo extends JpaRepository<Mobiles, Long> {
	
	public Mobiles findByPid(Long pid);

}
