package com.laura.core;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.laura.core.services.PaymentService;

@SpringBootTest
class CoreApplicationTests {

	@Autowired
	PaymentService service;
	@Test
	public void testDependencyinjection() {
		assertNotNull(service);
	}

}
