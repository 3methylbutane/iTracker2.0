package com.example.demo.itracker.service.Employee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.itracker.entity.Employee;
import com.example.demo.itracker.repository.EmployeeRepository;
import com.example.demo.itracker.utility.RequestEmployee;
import com.example.demo.itracker.utility.Response;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repo;

	@Override
	public Response createEmployee(RequestEmployee e) {
		Response response = new Response();
		//modal mapper
		//ModalMapper mm=new ModalMapper()
		//Employee emp=mm.map(e,Employee.class);
		Employee employee=null;
		try {
			employee=new Employee();
			employee.setEmployeeId(e.getEmployeeId());
			employee.setName(e.getName());
			employee.setEmail(e.getEmail());
			employee.setContactNumber(e.getContactNumber());
			employee.setGender(e.getGender());
			employee.setProfileUrl(e.getProfileUrl());
			employee.setEmployeeType(e.getEmployeeType());
			employee.setActive(e.isActive());
			employee.setSlotsAvailable(e.getSlotsAvailable());
//			employee.setSkills(e.getSkills());
			repo.save(employee);
			response.setSuccess(true);
			response.setMessage("Employee details added successfully");
		} catch (Exception ex) {
			response.setSuccess(false);
			response.setMessage(ex.getMessage());
		}
		return response;
	}

	@Override
	public Response updateEmployee(String id, RequestEmployee e) {
		Response response = new Response();
		try {
			Employee employee = null;
			Optional<Employee> optional = repo.findById(id);
			if (optional.isPresent()) {
				employee = optional.get();
				employee.setName(e.getName());
				employee.setEmail(e.getEmail());
				employee.setContactNumber(e.getContactNumber());
				employee.setGender(e.getGender());
				employee.setProfileUrl(e.getProfileUrl());
				employee.setEmployeeType(e.getEmployeeType());
				 //employee.setSkills(e.getSkills());
				 employee.setSlotsAvailable(e.getSlotsAvailable());
				employee.setActive(e.isActive());
				repo.save(employee);
				response.setSuccess(true);
				response.setMessage("Employee details updated successfully");
			} else
				throw new Exception("Invalid employee id");
		} catch (Exception ex) {
			response.setSuccess(false);
			response.setMessage(ex.getMessage());
		}
		return response;
	}

	@Override
	public Employee getEmployeeById(String id) {
		Employee employee = null;
		Optional<Employee> optional = repo.findById(id);
		if (optional.isPresent()) {
			employee = optional.get();
			return employee;
		}
		return employee;

	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> employees = (List<Employee>) repo.findAll();
		return employees;
	}

	@Override   
	public Response deleteEmployee(String id) {
		Response response = new Response();
		try {
			Employee employee = null;
			Optional<Employee> optional = repo.findById(id);
			if (optional.isPresent()) {
				employee = optional.get();
				employee.setActive(false);
				repo.save(employee);
				response.setSuccess(true);
				response.setMessage("Employee deleted successfully");
			} else
				throw new Exception("Invalid employee id");
		} catch (Exception e) {
			response.setSuccess(false);
			response.setMessage(e.getMessage());
		}
		return response;
	}

	@Override
	public Employee getEmployeeByEmail(String email) {
		Employee employee=null;
		employee=repo.findByEmail(email);	
		return employee;
	}
	
	

}

