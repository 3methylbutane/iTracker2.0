package com.example.demo.itracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.itracker.entity.Skills;

public interface SkillRepository extends JpaRepository<Skills,Integer>{

}
