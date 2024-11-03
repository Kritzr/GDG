 package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KrithikaOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(KrithikaOneApplication.class, args);
	package com.example.studentmanagement.model;

import javax.validation.constraints.*;

		public class Student {
			private Integer id;

			@NotEmpty(message = "Name cannot be empty")
			private String name;

			@Positive(message = "Age must be positive")
			private Integer age;

			@NotEmpty(message = "Course cannot be empty")
			private String course;

			@DecimalMin(value = "0.0", message = "Marks cannot be negative")
			private Double marks;

			private Boolean feesPaid = false;

			// Getters and setters
		}


	}
