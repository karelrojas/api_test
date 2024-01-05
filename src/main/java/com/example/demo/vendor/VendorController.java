package com.example.demo.vendor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VendorController {
	
	@Autowired
	private VendorService vendorService;

	@GetMapping("/")
	public String index() {
		return "This is the page for vendors";
	}

	
}
