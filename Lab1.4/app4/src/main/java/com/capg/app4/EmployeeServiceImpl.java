package com.capg.app4;

public class EmployeeServiceImpl implements EmployeeService{

	public Employee getDetails(int empId) {
		EmployeeDAO emp=new EmployeeDAO();
		return emp.getDetails(empId);
	}
 
}
