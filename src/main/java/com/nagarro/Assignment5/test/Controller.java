package com.nagarro.Assignment5.test;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/")
	public String sayHello() {
		return "Hello World" + LocalDateTime.now();
	}
	
	@GetMapping("/random")
	public String sayrandom() {
		return "Hello random" + LocalDateTime.now();
	}
	
	@GetMapping("/fortune")
	public String sayfortune() {
		return "Hello " + LocalDateTime.now();
	}
	
	@GetMapping("/for")
	public String sayfor() {
		return "Hello " + LocalDateTime.now();
	}

}
