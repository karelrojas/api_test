package com.example.demo.company;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

	private final CompanyRepository companyRepo;
	
	@Autowired
	public CompanyService(CompanyRepository companyRepo) {
		this.companyRepo = companyRepo;
	}
	
	public List<Company> getCompanies(){
		List<Company> CompanyList = new ArrayList<>();
		companyRepo.findAll().forEach(v -> CompanyList.add(v));
		return CompanyList;
	}
	
	public Company getCompany(String id) {
		return companyRepo.findById(id).get();
	}
	
	public void addCompany(Company c) {
		companyRepo.save(c);
	}
	
	public void updateCompany(Company c) {
		companyRepo.save(c);
	}
	
	public void deleteCompany(String id) {
		companyRepo.deleteById(id);
	}
}
