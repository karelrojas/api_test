package com.example.demo.company;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Company {

	@Id
	private String id;
	private String name;
	private String desc;
	
	public Company() {
		
	}
	
	public Company(String id, String name, String desc) {
		this.setId(id);
		this.setName(name);
		this.setDesc(desc);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
}
