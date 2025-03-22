package com.example.demo.itracker.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.itracker.entity.Employee;
public interface EmployeeRepository extends JpaRepository<Employee,String>{

	public Employee findByEmail(String email);
}




