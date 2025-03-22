package com.example.demo.itracker.entity;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class ScheduledInterview {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private Date date;
	private Time time;
	private String round;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="candidate_id")
	private CandidateDetails candidateDetails;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="employee_id")
	private Employee employee;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public CandidateDetails getCandidateDetails() {
		return candidateDetails;
	}
	
	public void setCandidateDetails(CandidateDetails candidateDetails) {
		this.candidateDetails = candidateDetails;
	}
	public ScheduledInterview(Date date, Time time, String round) {
		super();
		this.date = date;
		this.time = time;
		this.round = round;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
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
	public String getRound() {
		return round;
	}
	public void setRound(String round) {
		this.round = round;
	}
}
