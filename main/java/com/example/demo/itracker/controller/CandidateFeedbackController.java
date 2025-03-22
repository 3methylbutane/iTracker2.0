package com.example.demo.itracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.itracker.entity.CandidateFeedback;
import com.example.demo.itracker.repository.CandidateFeedbackRepository;

@RestController
@RequestMapping("/api/v1/employee/candidateFeedback")
public class CandidateFeedbackController {

	@Autowired
	private CandidateFeedbackRepository repo;
	
	@PostMapping
	public  CandidateFeedback add(@RequestBody CandidateFeedback candidateFeedback) {
		
		return repo.save(candidateFeedback);
	}
}
