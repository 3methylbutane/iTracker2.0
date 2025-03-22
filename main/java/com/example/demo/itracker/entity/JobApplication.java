package com.example.demo.itracker.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class JobApplication {

	@Id
	private String jobId;
	private String jobRole;
	private String jobPosition;
	private String jobDescription;
	private String jobStartDate;
	private int vacancies;
	private String skillsRequired;
	
	public JobApplication(String jobId, String jobRole, String jobPosition, String jobDescription, String jobStartDate,
			int vacancies, String skillsRequired) {
		super();
		this.jobId = jobId;
		this.jobRole = jobRole;
		this.jobPosition = jobPosition;
		this.jobDescription = jobDescription;
		this.jobStartDate = jobStartDate;
		this.vacancies = vacancies;
		this.skillsRequired = skillsRequired;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public String getJobRole() {
		return jobRole;
	}
	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}
	public String getJobPosition() {
		return jobPosition;
	}
	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	public String getJobStartDate() {
		return jobStartDate;
	}
	public void setJobStartDate(String jobStartDate) {
		this.jobStartDate = jobStartDate;
	}
	public int getVacancies() {
		return vacancies;
	}
	public void setVacancies(int vacancies) {
		this.vacancies = vacancies;
	}
	public String getSkillsRequired() {
		return skillsRequired;
	}
	public void setSkillsRequired(String skillsRequired) {
		this.skillsRequired = skillsRequired;
	}
	
}
