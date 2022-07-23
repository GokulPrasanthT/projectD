package com.chainsys.application.employee;

import java.util.Iterator;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
public class EmpService {
	@RequestMapping("/getemp")
	public String getAllEmp() {
		List<Employee> allEmployees = EmployeeDao.getAllEmployees();
		Iterator<Employee> empIterator = allEmployees.iterator();
		String result = "";
		while (empIterator.hasNext()) {
			Employee emp = empIterator.next();
			result += emp.getEmp_id() + "</p>" + emp.getFirst_name() + "</p>" + emp.getLast_name() + "</p>"
					+ emp.getEmail() + "</p>" + emp.getHire_date() + "</p>" + emp.getJob_id() + "</p>"
					+ emp.getSalary();

		}
		return result;
	}
	@RequestMapping("/getempid")
	public String getData(@RequestParam(name = "id ")String id) {
		int empId = Integer.parseInt(id);
			Employee emp = EmployeeDao.getEmployeeById(empId);
			return emp.getEmp_id() + "</p>" + emp.getFirst_name() + "</p>" + emp.getLast_name() + "</p>"
					+ emp.getEmail() + "</p>" + emp.getHire_date() + "</p>" + emp.getJob_id() + "</p>"
					+ emp.getSalary();
		}
	@RequestMapping(value="/newemployee",method=RequestMethod.POST)
	public int addNewEmployee() {
		return 0;
	}
	@RequestMapping(value="/updateemployee",method=RequestMethod.PUT)
	public int modifyEmployee() {
		return 1;
	}
	@RequestMapping(value="/removeemployee",method=RequestMethod.DELETE)
	public int deleteEmployee() {
		return 2;
	}
}
