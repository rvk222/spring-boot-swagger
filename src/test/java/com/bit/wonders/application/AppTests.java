package com.bit.wonders.application;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.bit.wonders.web.HelloController;

@SpringBootTest
@ActiveProfiles("dev")
public class AppTests {

	@Autowired
	private HelloController homeController;

	@Test
	@DisplayName(value = "Loads application context and verifies if OK.")
	void contextLoads() {
		assertNotNull(homeController);
	}

	@Test
	@DisplayName(value = "Test controller function.")
	void testController() {
		assertEquals(homeController.projectVersion(), "1.0", "Seems fine");
		assertEquals(homeController.helloWorld(), "This is dev", "Seems fine");
	}
}
