package com.example.demo.itracker.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.itracker.entity.Employee;
import com.example.demo.itracker.service.Employee.EmployeeService;
import com.example.demo.itracker.service.Employee.EmployeeServiceImpl;
import com.example.demo.itracker.utility.RequestEmployee;
import com.example.demo.itracker.utility.Response;

@RestController
@RequestMapping("/api/v1/employee/")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
    //we should not expose employee entity here
	@PostMapping()
	public Response createEmployee(@RequestBody RequestEmployee requestEmployee) { 
		return employeeService.createEmployee(requestEmployee);
	}

	@PutMapping("{id}")
	public Response updateEmployee(@PathVariable String id, @RequestBody RequestEmployee e) {
		return employeeService.updateEmployee(id, e);
	}

	@GetMapping("{id}")
	public Employee getEmployeeById(@PathVariable String id) {
		System.out.println("Add called");
		return employeeService.getEmployeeById(id);
	}

	@GetMapping()
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();
	}

	@DeleteMapping("{id}")
	public Response deleteEmployee(@PathVariable String id) {
		return employeeService.deleteEmployee(id);
	}

}
