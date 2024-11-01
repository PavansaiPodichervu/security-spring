package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Employee;

public interface UserRepo extends JpaRepository<Employee, Integer> {

}
