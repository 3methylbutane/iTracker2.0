package com.example.demo.itracker.entity;

import com.example.demo.itracker.entity.EmployeeSlotAvailability;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Employee {
	@Id
	String employeeId;
	String name;
	String email;
	String contactNumber;
	String gender;
	String profileUrl;
	String employeeType;
	boolean isActive;

	// one employee can book many slots
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "employee_id")
	//List<EmployeeSlotAvailability> slotsAvailable;
//	 @JsonManagedReference
	List<EmployeeSlotAvailability> slotsAvailable;
	


	// one employee can have many skills and vice versa
	// there are many employees who have a particular skill
//@ManyToMany(cascade = CascadeType.ALL)
	//@OneToMany(cascade=CascadeType.ALL)
	//List<Skills> skills;

	public List<EmployeeSlotAvailability> getSlotsAvailable() {
		return slotsAvailable;
	}

	public void setSlotsAvailable(List<EmployeeSlotAvailability> slotsAvailable) {
		this.slotsAvailable = slotsAvailable;
	}

//	public List<Skills> getSkills() {
//		return skills;
//	}
//
//	public void setSkills(List<Skills> skills) {
//		this.skills = skills;
//	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
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

	public String getProfileUrl() {
		return profileUrl;
	}

	public void setProfileUrl(String profileUrl) {
		this.profileUrl = profileUrl;
	}

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

}
