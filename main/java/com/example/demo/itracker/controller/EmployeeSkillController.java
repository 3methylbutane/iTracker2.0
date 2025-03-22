package com.example.demo.itracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.itracker.entity.EmployeeSkill;
import com.example.demo.itracker.entity.Skills;
import com.example.demo.itracker.service.EmployeeSkillsService.EmployeeSkillsService;
import com.example.demo.itracker.utility.RequestBodyEmployeeSkills;
import com.example.demo.itracker.utility.Response;

@RestController
@RequestMapping("/api/v1/employee/skill/")
public class EmployeeSkillController {

	@Autowired
	EmployeeSkillsService employeeSkillsService;

	@PostMapping()
	public Response addSkill(@RequestBody RequestBodyEmployeeSkills rq ) {
		
		return employeeSkillsService.addSkill(rq);
	}
	
	@GetMapping("s_id/{id}")
	public List<EmployeeSkill> getListOfEmployeeBySkill(@PathVariable(name="id") int skillId)
	{
		return employeeSkillsService.getListOfEmployeeBySkill(skillId);
	}
	
	@GetMapping("e_id/{id}")
	public List<EmployeeSkill> getListOfEmployeeByEmployeeId(@PathVariable(name="id") String employeeId)
	{
		return employeeSkillsService.getListOfEmployeeByEmployeeId(employeeId);
	}
	
	@GetMapping()
	public List<EmployeeSkill> getAll()
	{
		return employeeSkillsService.getAll();
	}

	@DeleteMapping("e_id/{id}")
	public Response delete(@PathVariable(name = "id") int id)
	{
		return employeeSkillsService.deleteSkill(id);
	}

	@GetMapping("/showAll")
	public List<Skills> getAllSkills(){
		return employeeSkillsService.getAllSkills();
	}

	@PutMapping("e_id/{id}")
	public Response update(@PathVariable int id, RequestBodyEmployeeSkills rq){
		return employeeSkillsService.updateSkill(id,rq);
	}
}
