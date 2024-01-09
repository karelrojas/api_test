package com.example.demo.vendor;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface VendorRepository extends CrudRepository<Vendor, String>{

	public List<Vendor> findByCompanyId(String CompanyId);
}
