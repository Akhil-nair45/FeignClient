package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Employee;
import com.example.demo.Service.EmployeeService;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {

	@Autowired
	private EmployeeService es;
	
	@PostMapping("/")
	public ResponseEntity<?> addEmp(@RequestBody Employee emp)
	{
		return new ResponseEntity<>(es.addEmployee(emp),HttpStatus.CREATED);
	}
	
	@GetMapping("/All")
	public ResponseEntity<?> findAll()
	{
		return new ResponseEntity<>(es.findAll(),HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<?> findById(@PathVariable Integer id)
	{
		return new ResponseEntity<>(es.getById(id),HttpStatus.OK);
	}
	
	@PutMapping("/edit")
	public ResponseEntity<?> editEmployee(@RequestBody Employee emp)
	{
		return new ResponseEntity<>(es.editEmp(emp),HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteEmp(@PathVariable Integer id)
	{
		return new ResponseEntity<>(es.deleteEmployee(id),HttpStatus.OK);
	}
}
