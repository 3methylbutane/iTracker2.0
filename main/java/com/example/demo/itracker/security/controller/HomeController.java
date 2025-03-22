package com.example.demo.itracker.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.itracker.entity.Employee;
import com.example.demo.itracker.service.Employee.EmployeeService;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/v1/home")
public class HomeController {

	@Autowired
    private EmployeeService employeeService;
	@GetMapping()
    public Map<String, Object> getAttributes(@AuthenticationPrincipal(expression = "attributes") Object name) {

        String attr[]=name.toString().split(",");
        String email=attr[5].split("=")[1];
        System.out.println("Email :"+email);
        //find Employee object against that email
        //then check employee type
        //set employeeType to a variable of String type
        //if employeeType is panelist then set a boolean variable equal to true;
        String page="invalid";
        Employee employee=employeeService.getEmployeeByEmail(email);
        if(employee!=null) {
        String employeeType=employee.getEmployeeType();
        System.out.println(employee);
        if(employeeType.equalsIgnoreCase("panelist")) {
        	page="panelist";
        }else if(employeeType.equalsIgnoreCase("recruiter")) {
        	page="recruiter";
        }
        }
    	return Collections.singletonMap("page",page);
    }
}
