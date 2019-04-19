package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDockerTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerTestApplication.class, args);
	}
	@GetMapping("/greet/{name}")
	 public String greeting(@PathVariable String name) {
	    return "Hi!! " + name;
	 }


}
