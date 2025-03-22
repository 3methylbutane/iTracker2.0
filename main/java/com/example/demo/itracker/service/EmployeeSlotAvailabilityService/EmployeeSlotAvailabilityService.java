package com.example.demo.itracker.service.EmployeeSlotAvailabilityService;

import java.util.List;
import java.util.Map;

import com.example.demo.itracker.entity.EmployeeSlotAvailability;
import com.example.demo.itracker.utility.RequestBodyEmployeeSlotAvailability;
import com.example.demo.itracker.utility.Response;

public interface EmployeeSlotAvailabilityService {

	public Response addSlot(String id,RequestBodyEmployeeSlotAvailability rq);
	public Map<String,List<EmployeeSlotAvailability>> getALLSlotDetails();
	public List<EmployeeSlotAvailability> getSlotDetailsById(String id);
	public Response deleteSlot(String employeeId,int slotId);
	
}
