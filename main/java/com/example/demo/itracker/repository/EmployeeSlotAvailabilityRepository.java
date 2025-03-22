package com.example.demo.itracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.itracker.entity.EmployeeSlotAvailability;

public interface EmployeeSlotAvailabilityRepository extends JpaRepository<EmployeeSlotAvailability,Integer>{

}
