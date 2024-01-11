package com.example.demo.vendor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.company.Company;

@RestController
public class VendorController {
	
	private final VendorService vendorService;
	
	@Autowired
	public VendorController(VendorService vendorService) {
		this.vendorService = vendorService;
	}

	@GetMapping("/companies/{companyId}/vendors")
	public List<Vendor> getVendors(@PathVariable String companyId) {
		return vendorService.getVendors(companyId);
	}
	
	@GetMapping("/companies/{companyId}/vendors/{id}")
	public Vendor getVendor(@PathVariable String id) {
		return vendorService.getVendor(id);
	}
	
	@PostMapping("/companies/{companyId}/vendors")
	public void addVendor(@RequestBody Vendor v, @PathVariable String companyId) {
		v.setCompany(new Company(companyId, "", ""));
		vendorService.addVendor(v);
	}
	
	@PutMapping("/companies/{companyId}/vendors/{id}")
	public void updateVendor(@RequestBody Vendor v,@PathVariable String companyId, @PathVariable String id) {
		if (v.getCompany().getId() != companyId)
			v.setCompany(new Company(companyId, "", ""));
		vendorService.updateVendor(id, v);
	}

	@DeleteMapping("/companies/{companyId}/vendors/{id}")
	public void deleteVendor(@PathVariable String id) {
		vendorService.deleteVendor(id);
	}
	
}
