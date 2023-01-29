package com.bos.example.greet.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
	@GetMapping("/greet")
	public String greet() throws InterruptedException {	
		Thread.sleep(1000);
		return "Hello "+LocalDateTime.now();
	}

}
