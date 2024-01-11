package com.example.demo.unitTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.company.CompanyController;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

@SpringBootTest
public class APIUnitTest {

	@Autowired
	private CompanyController companyController;
	
	@Test
	void contextLoads() throws Exception{
		assertThat(companyController).isNotNull();
	}
}
