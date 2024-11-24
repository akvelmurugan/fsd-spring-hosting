package com.klu.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Laptops {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	Long pid;
	String pname;
	String pcost;
	String pimage;
	public String getPimage() {
		return pimage;
	}

	public void setPimage(String pimage) {
		this.pimage = pimage;
	}

	String pqty;
	
	public Laptops(Long pid, String pname, String pcost, String pqty) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pcost = pcost;
		this.pqty = pqty;
	}
	
	public Laptops() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getPid() {
		return pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPcost() {
		return pcost;
	}
	public void setPcost(String pcost) {
		this.pcost = pcost;
	}
	public String getPqty() {
		return pqty;
	}
	public void setPqty(String pqty) {
		this.pqty = pqty;
	}

	@Override
	public String toString() {
		return "Laptops [id=" + id + ", pid=" + pid + ", pname=" + pname + ", pcost=" + pcost + ", pqty=" + pqty + "]";
	}
	
	
	
	

}
