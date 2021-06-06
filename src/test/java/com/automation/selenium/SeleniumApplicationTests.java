package com.automation.selenium;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SeleniumApplicationTests {
	@Autowired
	private Faker faker;

	@Test
	void contextLoads() {
		System.out.println(this.faker.name().firstName());

	}

}
