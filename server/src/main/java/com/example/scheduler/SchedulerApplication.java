package com.example.scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class SchedulerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SchedulerApplication.class, args);

		Environment env = context.getEnvironment();
		String port = env.getProperty("server.port", "8080");

		System.out.println("\n=== Scheduler Application started successfully! ===");
		System.out.printf("URL: http://localhost:%s \n%n", port);
	}
}
