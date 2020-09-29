package com.example.dd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DdApplication {
	public static void main(String[] args) {
		SpringApplication.run(DdApplication.class, args);
	}

	@GetMapping("/{name}")
	public String getName(@PathVariable final String name) {
		return "Hello " + name;
	}
}
