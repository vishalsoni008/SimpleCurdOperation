package com.simplecurdoperation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private int rollNumber;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Long id, String name, int rollNumber) {
		super();
		this.id = id;
		this.name = name;
		this.rollNumber = rollNumber;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber=rollNumber;
	}

}
