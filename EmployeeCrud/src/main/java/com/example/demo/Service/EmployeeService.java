package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Employee;

public interface EmployeeService {

	
	public Employee addEmployee(Employee emp);
	
	public List<Employee> findAll();
	
	public Employee getById(Integer id);
	
	public Employee editEmp(Employee emp);
	
	public String deleteEmployee(Integer id);
}
