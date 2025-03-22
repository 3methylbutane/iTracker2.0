package com.example.demo.itracker.service.EmployeeSkillsService;

import java.util.List;

import com.example.demo.itracker.entity.EmployeeSkill;
import com.example.demo.itracker.entity.Skills;
import com.example.demo.itracker.utility.RequestBodyEmployeeSkills;
import com.example.demo.itracker.utility.Response;

public interface EmployeeSkillsService {

	public Response addSkill(RequestBodyEmployeeSkills rq);
	public List<EmployeeSkill> getListOfEmployeeBySkill(int skillId);
	public List<EmployeeSkill> getListOfEmployeeByEmployeeId(String employeeId);
	public List<EmployeeSkill> getAll();
	public Response updateSkill(int id,RequestBodyEmployeeSkills rq);
	public Response deleteSkill(int id);
	public List<Skills> getAllSkills();
}
