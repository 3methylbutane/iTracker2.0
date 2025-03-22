package com.example.demo.itracker.service.EmployeeSlotAvailabilityService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.itracker.entity.Employee;
import com.example.demo.itracker.entity.EmployeeSlotAvailability;
import com.example.demo.itracker.repository.EmployeeRepository;
import com.example.demo.itracker.repository.EmployeeSlotAvailabilityRepository;
import com.example.demo.itracker.utility.RequestBodyEmployeeSlotAvailability;
import com.example.demo.itracker.utility.Response;

@Service
public class EmployeeSlotAvailabilityServiceImpl implements EmployeeSlotAvailabilityService {

	@Autowired
	private EmployeeRepository erepo;
    @Autowired
    private EmployeeSlotAvailabilityRepository esarepo;
	@Override
	public Response addSlot(String id, RequestBodyEmployeeSlotAvailability rq) {
		Response response = new Response();
		try {
			EmployeeSlotAvailability obj = new EmployeeSlotAvailability();
			obj.setId(rq.getId());
			obj.setDate(rq.getDate());
			obj.setTime(rq.getTime());
			Employee employee = erepo.getById(id);
			employee.getSlotsAvailable().add(obj);
			erepo.save(employee);
			response.setSuccess(true);
			response.setMessage("Slot added successfully");
		} catch (Exception e) {
			response.setSuccess(false);
			response.setMessage(e.getMessage());
		}
		return response;
	}

	@Override
	// this method returns all the slot details of employee
	public Map<String, List<EmployeeSlotAvailability>> getALLSlotDetails() {
		Map<String, List<EmployeeSlotAvailability>> m = new HashMap<>();
		List<Employee> employees = erepo.findAll();
		for (Employee employee : employees) {
			m.put(employee.getEmployeeId(), employee.getSlotsAvailable());
		}
		return m;
	}

	@Override
	public List<EmployeeSlotAvailability> getSlotDetailsById(String id) {
		Optional<Employee> optional = erepo.findById(id);
		if (optional.isPresent()) {
			Employee e = optional.get();
			return e.getSlotsAvailable();
		}
		return null;
	}

	@Override
	public Response deleteSlot(String employeeId, int slotId) {
		Response response=new Response();
		Optional<Employee> optional=erepo.findById(employeeId);
		int flag=0;
		if (optional.isPresent()) {
			Employee employee=optional.get();
			List<EmployeeSlotAvailability> slots=employee.getSlotsAvailable();
			for(EmployeeSlotAvailability esa:slots)
			{
				if(esa.getId()==slotId)
				{
					flag=1;
					slots.remove(esa);
					esarepo.delete(esa);
				}
			}
			erepo.save(employee);
			}
		if(flag==1)
		{
			response.setSuccess(true);
			response.setMessage("Slot deleted successfully");
			
		}
		else
		{
			response.setSuccess(false);
			response.setMessage("Invalid details in request");
		}
		return response;
	}

}
