package com.example.demo.Feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Dto.Employee;



@FeignClient(name = "EmployeeFeign", url = "http://localhost:8888/Employee/")
public interface EmployeeFeignUtil {

	@PostMapping("/")
	public ResponseEntity<?> addEmp(@RequestBody Employee emp);
	
	
	@GetMapping("/All")
	public ResponseEntity<?> findAll();
	
	
	@GetMapping("/find/{id}")
	public ResponseEntity<?> findById(@PathVariable Integer id);
	
	
	@PutMapping("/edit")
	public ResponseEntity<?> editEmployee(@RequestBody Employee emp);
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteEmp(@PathVariable Integer id);
	
}
