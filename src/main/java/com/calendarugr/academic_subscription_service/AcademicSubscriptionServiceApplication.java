package com.calendarugr.academic_subscription_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
@EnableDiscoveryClient
public class AcademicSubscriptionServiceApplication {

	public static void main(String[] args) {

		Dotenv dotenv = Dotenv.load();
		System.setProperty("DB_URL", dotenv.get("DB_URL"));
		System.setProperty("DB_NAME", dotenv.get("DB_NAME"));
		System.setProperty("API_KEY", dotenv.get("API_KEY"));
		System.setProperty("FTP_PASSWORD", dotenv.get("FTP_PASSWORD"));
		SpringApplication.run(AcademicSubscriptionServiceApplication.class, args);
	}

}
