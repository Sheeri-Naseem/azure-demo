package com.example.azuredemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.azuredemo.entities.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
