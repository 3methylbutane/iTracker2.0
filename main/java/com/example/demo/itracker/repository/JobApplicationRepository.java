package com.example.demo.itracker.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.itracker.entity.JobApplication;

public interface JobApplicationRepository extends CrudRepository<JobApplication,String>{

}
