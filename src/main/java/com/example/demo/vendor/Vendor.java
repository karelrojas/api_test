package com.example.demo.vendor;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Vendor {
	
	@Id
	private String id;
	private String name;
	private String desc;
	
	public Vendor() {
		
	}
	
	public Vendor(String id, String name, String desc) {
		this.id = id;
		this.setName(name);
		this.setDesc(desc);
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
