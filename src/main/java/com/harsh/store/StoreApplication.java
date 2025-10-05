package com.harsh.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		// Start Spring Boot application and get ApplicationContext
		ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
		UserService userService = context.getBean(UserService.class);
		userService.registerUser(new User(1L, "Harsh", "harshjaiswal497@gmail.com", "123abc"));
//		userService.registerUser(new User(1L, "Harsh", "harshjaiswal497@gmail.com", "123abc"));
	}
}
