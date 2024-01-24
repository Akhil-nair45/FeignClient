package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Employee;
import com.example.demo.Repository.EmployeeRepo;

@Service
public class EmployeeService implements com.example.demo.Service.EmployeeService{

	@Autowired
	private EmployeeRepo er;
	
	@Override
	public Employee addEmployee(Employee emp) {
		return er.save(emp);
	}

	@Override
	public List<Employee> findAll() {
		return er.findAll();
	}

	@Override
	public Employee getById(Integer id) {
		return er.findById(id).get();
	}

	@Override
	public Employee editEmp(Employee emp) {
		return er.save(emp);
	}

	@Override
	public String deleteEmployee(Integer id) {
		Employee employee = er.findById(id).get();
		if(employee!=null)
		{
			er.delete(employee);
			return "Employee Deleted Successfully!!!!";
		}
		return "Please enter correct ID";
	}

}
