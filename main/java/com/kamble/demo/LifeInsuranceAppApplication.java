package com.kamble.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication @EnableAsync
public class LifeInsuranceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(LifeInsuranceAppApplication.class, args);
	}
	
	
//	@Bean
//	public JavaMailSender getJavaMailSender() {
//		
//		return new JavaMailSender();
//	}

}
