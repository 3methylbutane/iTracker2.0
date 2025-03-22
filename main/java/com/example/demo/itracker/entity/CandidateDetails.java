package com.example.demo.itracker.entity;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.example.demo.itracker.entity.JobApplication;


@Entity
public class CandidateDetails {
	@Id
	private String candidateId;
	private String name;
	private String email;
	private String contactNumber;
	private String gender;
	private String resumeLink;

	@ManyToMany(cascade=CascadeType.ALL)
//	@JoinColumn(name="job_id")
	private List<JobApplication> jobApplication;
	
	//one candidate can have many skills and vice versa
	//@ManyToMany(cascade=CascadeType.ALL)
	//List<Skills> skills;
	
	
	
//	public List<Skills> getSkills() {
//		return skills;
//	}
//	public void setSkills(List<Skills> skills) {
//		this.skills = skills;
//	}
	
	public List<JobApplication> getJobApplication() {
		return jobApplication;
	}
	public void setJobApplication(List<JobApplication> jobApplication) {
		this.jobApplication = jobApplication;
	}
	
	
	public String getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(String candidateId) {
		this.candidateId = candidateId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getResumeLink() {
		return resumeLink;
	}
	public void setResumeLink(String resumeLink) {
		this.resumeLink = resumeLink;
	}

}
