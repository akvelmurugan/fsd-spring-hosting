package com.klu.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.klu.model.Headphones;
import com.klu.model.Laptops;
import com.klu.model.Login;
import com.klu.model.Mobiles;
import com.klu.service.Service;

@RestController
@CrossOrigin
public class AppController {
	
	@Autowired
	Service service;

	@GetMapping("/laptops")
	public List<Laptops> getAllLaptops()
	{
		return service.viewAllLaptops();
	}
	
	@GetMapping("/laptops/{pid}")
	public Laptops viewLaptopDetail(@PathVariable("pid") Long pid)
	{
		return service.viewPerticularLaptop(pid);
	}
	
	@PostMapping("/lapin")
	public String addLaptops(@RequestBody Laptops laptop)
	{
		return service.insertLaptops(laptop);
		
	}
	
	@GetMapping("/mobiles")
	public List<Mobiles> getAllMobiles()
	{
		return service.viewAllMobiles();
	}
	
	@GetMapping("/mobiles/{pid}")
	public Mobiles viewMobilesDetail(@PathVariable("pid") Long pid)
	{
		return service.viewPerticularMobile(pid);
	}
	
	@PostMapping("/mobin")
	public String addMobiles(@RequestBody Mobiles mobile)
	{
		return service.insertMobiles(mobile);
		
	}
	
	@GetMapping("/headphones")
	public List<Headphones> getAllHeadphones()
	{
		return service.viewAllHeadphones();
	}
	
	@GetMapping("/headphones/{pid}")
	public Headphones viewHeadphoneDetail(@PathVariable("pid") Long pid)
	{
		return service.viewPerticularHeadphone(pid);
	}
	
	@PostMapping("/headin")
	public String addHeadphones(@RequestBody Headphones headphone)
	{
		return service.insertHeadphones(headphone);
		
	}
	
	@PostMapping("/login")
	public Map<String, String> loginView(@RequestBody Login login)
	{
		return service.viewUser(login);
	}
}
