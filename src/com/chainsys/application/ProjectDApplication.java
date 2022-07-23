package com.chainsys.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectDApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectDApplication.class, args); // The SpringApplication.run will load the class in memory and will keep running 24�7 listening in Port 8080.
	}
}