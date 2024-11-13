package com.example.SpringJunit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/first")
	public String getMessage() {
		return "Hello";
	}
}
