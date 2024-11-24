package com.klu.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.klu.model.Headphones;
import com.klu.model.Laptops;
import com.klu.model.Login;
import com.klu.model.Mobiles;

@Component
public class Service {
	
	@Autowired
	LaptopsRepo repo1;
	@Autowired
	LoginRepo repo2;
	@Autowired
	MobilesRepo repo3;
	@Autowired
	HeadphonesRepo repo4;
	
	public String insertLaptops(Laptops laptop)
	{
		repo1.save(laptop);
		return "Inserted.....";
			
	}

	public List<Laptops> viewAllLaptops()
	{
		return repo1.findAll();
	}
	
	public Laptops viewPerticularLaptop(Long pid)
	{
		return repo1.findByPid(pid);
	}
	
	public String insertMobiles(Mobiles mobiles)
	{
		repo3.save(mobiles);
		return "Inserted.....";
			
	}

	public List<Mobiles> viewAllMobiles()
	{
		return repo3.findAll();
	}
	
	public Mobiles viewPerticularMobile(Long pid)
	{
		return repo3.findByPid(pid);
	}
	
	public String insertHeadphones(Headphones headphones)
	{
		repo4.save(headphones);
		return "Inserted.....";
			
	}

	public List<Headphones> viewAllHeadphones()
	{
		return repo4.findAll();
	}
	
	public Headphones viewPerticularHeadphone(Long pid)
	{
		return repo4.findByPid(pid);
	}
	
	public Map<String, String> viewUser(Login login)
	{
		Login login2 = repo2.findByUsername(login.getUsername());
		Map<String, String> res = new HashMap<String, String>();
		
		if(login2==null)
		{
			res.put("login", "fail");
		}
		else if (login2.getPassword().equals(login.getPassword())) {
			res.put("login", "success");
		}
		else {
			res.put("login", "fail");
		}
		
		return res;
		
	}
}
