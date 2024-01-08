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

@RestController
public class VendorController {
	
	
	@Autowired
	private VendorService vendorService;

	@GetMapping("/vendors")
	public List<Vendor> getVendors() {
		return vendorService.getVendors();
	}
	
	@GetMapping("/vendors/{id}")
	public Vendor getVendor(@PathVariable String id) {
		return vendorService.getVendor(id);
	}
	
	@PostMapping("/vendors")
	public void addVendor(@RequestBody Vendor v) {
		vendorService.addVendor(v);
	}
	
	@PutMapping("/vendors/{id}")
	public void updateVendor(@RequestBody Vendor v, @PathVariable String id) {
		vendorService.updateVendor(id, v);
	}

	@DeleteMapping("/vendors/{id}")
	public void deleteVendor(@PathVariable String id) {
		vendorService.deleteVendor(id);
	}
	
}
