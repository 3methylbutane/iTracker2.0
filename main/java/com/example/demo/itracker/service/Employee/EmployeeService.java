package com.example.demo.itracker.service.Employee;

import java.util.List;

import com.example.demo.itracker.entity.Employee;
import com.example.demo.itracker.utility.RequestEmployee;
import com.example.demo.itracker.utility.Response;

public interface EmployeeService {
	public Response createEmployee(RequestEmployee e);

	public Response updateEmployee(String id, RequestEmployee e);

	public Employee getEmployeeById(String id);

	public List<Employee> getAllEmployee();

	public Response deleteEmployee(String id);
	
	public Employee getEmployeeByEmail(String email);
}
