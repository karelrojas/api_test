package com.example.demo.company;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {

	@Autowired
	private CompanyService companyService;
	
	@GetMapping("/companies")
	public List<Company> getCompanies(){
		return companyService.getCompanies();
	}
	
	@GetMapping("/companies/{id}")
	public Company getCompany(@PathVariable String id) {
		return companyService.getCompany(id);
	}

	@PostMapping("/companies")
	public void addCompany(@RequestBody Company c) {
		companyService.addCompany(c);
	}
	
	@PutMapping("/companies/{id}")
	public void updateCompany(@RequestBody Company c, @PathVariable String id) {
		companyService.updateCompany(c);
	}
	
	@DeleteMapping("/companies/{id}")
	public void deleteCompany(@PathVariable String id) {
		companyService.deleteCompany(id);
	}
}
