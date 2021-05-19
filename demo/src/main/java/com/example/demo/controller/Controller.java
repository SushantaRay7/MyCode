package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/test")
	public String showMessage() {
		return "Hello World from Docker";
	}

	@GetMapping("/name/{name}")
	public String showName(@PathVariable("name") String name) {
		return "My name is " + name;
	}

}
