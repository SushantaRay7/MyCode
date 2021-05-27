package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Employee;


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
	
	@PostMapping("/addEmployee")
	public String addEmplyee(@RequestBody Employee e) {
		
		return "Employee added with the name "+e.getName();
	}
	
	public Object add(Object o) {
		return o;
	}

}
