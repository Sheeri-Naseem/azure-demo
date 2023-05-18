package com.example.azuredemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.azuredemo.entities.Employee;
import com.example.azuredemo.repository.EmployeeRepo;

@RestController
public class MyController {
	
	@Autowired
	private EmployeeRepo repo;
	
	
	@GetMapping("/")
	public String getTestString() {
		return "<h1>Azure Demo app running now...</h1>";
	}
	
	@PostMapping("/add")
	public Employee addEmp(@RequestBody Employee e) {
		return repo.save(e);
	}
	
	@GetMapping("/Employees")
	public List<Employee> getAllEmployees(){
		return repo.findAll();
	}
	
}
