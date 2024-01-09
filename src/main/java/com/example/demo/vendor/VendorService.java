package com.example.demo.vendor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendorService {

	@Autowired
	private VendorRepository vendorRepo;
	
	//Gets list of vendors
	public List<Vendor> getVendors(String companyId) {
		List<Vendor> vendorList = new ArrayList<>();
		vendorRepo.findByCompanyId(companyId).forEach(v -> vendorList.add(v));
		return vendorList;
		
	}
	
	// Gets a single vendor by Id
	public Vendor getVendor(String id) {
		return vendorRepo.findById(id).get();
	}
	
	public void addVendor(Vendor v) {
		vendorRepo.save(v);
	}
	
	public void updateVendor(String id, Vendor v) {
		//vendorRepo.findById(id);
		vendorRepo.save(v);
	}
	
	public void deleteVendor(String id) {
		vendorRepo.deleteById(id);
	}
}
