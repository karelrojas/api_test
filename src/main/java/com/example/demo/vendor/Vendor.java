package com.example.demo.vendor;

import com.example.demo.company.Company;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Vendor {
	
	@Id
	private String id;
	private String name;
	private String desc;
	@ManyToOne
	private Company company;
	
	public Vendor() {
		
	}
	
	public Vendor(String id, String name, String desc, String companyId) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.company = new Company(companyId, "", "");
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

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
}
