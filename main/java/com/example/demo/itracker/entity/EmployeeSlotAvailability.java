package com.example.demo.itracker.entity;

import java.sql.Time;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.web.bind.annotation.PathVariable;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.sql.Date;

@Entity
public class EmployeeSlotAvailability {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; // fake id
	

	private Date date; //localdate
	private Time time; //localdatetime
	
//	@ManyToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="employee_id")
//	 @JsonBackReference
//	private Employee employee;
//	
//	public Employee getEmployee() {
//		return employee;
//	}
//
//	public void setEmployee(Employee employee) {
//		this.employee = employee;
//	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

}
