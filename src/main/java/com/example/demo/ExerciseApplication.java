package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class ExerciseApplication {
	@GetMapping("/msg")
	public String message() {
		return "HEY JENKIN";
	}

	public static void main(String[] args) {
		SpringApplication.run(ExerciseApplication.class, args);
		System.out.println("Hello");
		System.out.println("hi");
		System.out.println("Hey team");
	}

}
