package com.example.demo.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.data.Employee;

public interface EmployeeInterface extends JpaRepository<Employee,Integer> {

}
