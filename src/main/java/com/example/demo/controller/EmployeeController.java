package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Employee;
import com.example.demo.repo.UserRepo;

@RestController
public class EmployeeController {
	@Autowired
	UserRepo repo;

	@GetMapping("/demo")
	public String getDemo() {
		return "hoooo";
	}

	@PostMapping()
	public String saveEmployee(@RequestBody Employee emp) {
		repo.save(emp);
		return "employee save";
	}

	@GetMapping("/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return repo.findById(id).get();
	}
}
