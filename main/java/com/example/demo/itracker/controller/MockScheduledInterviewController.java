package com.example.demo.itracker.controller;

import java.sql.Date;
import java.sql.Time;
import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.itracker.utility.MockScheduledInterview;

@RestController
@RequestMapping("/api/v1/scheduledInterview/")
public class MockScheduledInterviewController {

	@GetMapping("onGoing")
	public List<MockScheduledInterview> getOnGoing()
	{
		MockScheduledInterview interview1,interview2,interview3,interview4,interview5,interview6,interview7,interview8,interview9,interview10;
		interview6=new MockScheduledInterview(106L,"8-04-2022","10:00:00","R1",906L,"INT1027",true);
		interview7=new MockScheduledInterview(107L,"9-04-2022","10:00:00","R1",907L,"INT1027",true);
		interview8=new MockScheduledInterview(108L,"10-04-2022","10:00:00","R1",908L,"INT1027",true);
		interview9=new MockScheduledInterview(109L,"11-04-2022","10:00:00","R1",909L,"INT1027",true);
		interview10=new MockScheduledInterview(110L,"12-04-2022","10:00:00","R1",910L,"INT1027",true);
		
//		interview2=new MockScheduledInterview(102L,null,null,"R2",902L,"INT1027");
		List<MockScheduledInterview> list=new LinkedList<>();
		list.add(interview6);
		list.add(interview7);
		list.add(interview8);
		list.add(interview9);
		list.add(interview10);
		
		return list;
	}
	
	@GetMapping("completed")
	public List<MockScheduledInterview> getScheduled()
	{MockScheduledInterview interview1,interview2,interview3,interview4,interview5,interview6,interview7,interview8,interview9,interview10;
	interview1=new MockScheduledInterview(101L,"3-03-2022","10:00:00","R1",901L,"INT1027",false);
	interview2=new MockScheduledInterview(102L,"4-03-2022","11:00:00","R2",902L,"INT1027",false);
	interview3=new MockScheduledInterview(103L,"5-03-2022","10:00:00","R1",903L,"INT1027",false);
	interview4=new MockScheduledInterview(104L,"6-03-2022","11:00:00","R1",904L,"INT1027",false);
	interview5=new MockScheduledInterview(105L,"7-03-2022","10:00:00","R1",905L,"INT1027",false);

	List<MockScheduledInterview> list=new LinkedList<>();
	list.add(interview1);
	list.add(interview2);
	list.add(interview3);
	list.add(interview4);
	list.add(interview5);
	return list;
		
		
		
	}
	
}
