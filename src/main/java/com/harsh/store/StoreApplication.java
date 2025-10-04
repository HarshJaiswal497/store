package com.harsh.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		// Start Spring Boot application and get ApplicationContext
		ApplicationContext context = SpringApplication.run(StoreApplication.class, args);

		// Get the NotificationManager bean from the context
		NotificationManager notificationManager = context.getBean(NotificationManager.class);

		// Call the sendNotification method
		notificationManager.sendNotification("Hello from Spring Boot!");
	}
}
