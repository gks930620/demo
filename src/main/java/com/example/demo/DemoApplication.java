package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
public class DemoApplication {
	//H2를 실행하세요
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
