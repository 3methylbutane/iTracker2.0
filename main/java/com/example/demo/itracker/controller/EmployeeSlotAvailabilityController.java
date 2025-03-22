package com.example.demo.itracker.controller;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.itracker.entity.Employee;
import com.example.demo.itracker.entity.EmployeeSlotAvailability;
import com.example.demo.itracker.repository.EmployeeRepository;
import com.example.demo.itracker.repository.EmployeeSlotAvailabilityRepository;
import com.example.demo.itracker.service.EmployeeSlotAvailabilityService.EmployeeSlotAvailabilityService;
import com.example.demo.itracker.utility.RequestBodyEmployeeSlotAvailability;
import com.example.demo.itracker.utility.Response;




@RestController
@RequestMapping("/api/v1/slot/")
public class EmployeeSlotAvailabilityController {

	@Autowired
	private EmployeeSlotAvailabilityService service;
	
	@PostMapping("{id}")
	public Response addSlot(@PathVariable String id,@RequestBody RequestBodyEmployeeSlotAvailability e)
	{
		System.out.println(e);
		return service.addSlot(id, e);
	}
	
	@GetMapping()
	public Map<String,List<EmployeeSlotAvailability>> getALLSlotDetails(){
		return service.getALLSlotDetails();
	}
	
	@GetMapping("{id}")
	public List<EmployeeSlotAvailability> getSlotDetailsById(@PathVariable String id){
		return service.getSlotDetailsById(id);
	}
	
	@DeleteMapping
	public Response deleteSlot(@RequestParam(name = "e_id") String e_id,@RequestParam(name="s_id") int s_id)
	{
		return service.deleteSlot(e_id,s_id);
	}
	
	
}
