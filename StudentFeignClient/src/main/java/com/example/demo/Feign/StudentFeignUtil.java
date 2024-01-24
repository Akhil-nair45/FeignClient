package com.example.demo.Feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Dto.Student;


@FeignClient(name = "StudentFeign" ,url = "http://localhost:9999/crud/")
public interface StudentFeignUtil {

	
//	the url of the student controller and the feign interface should be the same 
//	the url of the feign interface and the feign controller can be different or same
	
	
	@PostMapping("/")
	public ResponseEntity<?> addStudent(@RequestBody Student student);
	
	
	@GetMapping("/All")
	public ResponseEntity<?> getAllStudents();
	
	
	@GetMapping("/id/{id}")
	public ResponseEntity<?> getStudentById(@PathVariable Long id);
	
	@PutMapping("/update")
	public ResponseEntity<?> updateStudent(@RequestBody Student student);
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteStudenT(@PathVariable Long id );
	
	
	@GetMapping("/name/{name}")
	public ResponseEntity<?> findStudentByName(@PathVariable String name);
	
	
	@GetMapping("/standard/{standard}")
	public ResponseEntity<?> findStudentByStandard(@PathVariable String standard );
	
	
	@GetMapping("/school/{school}")
	public ResponseEntity<?> findBySchool(@PathVariable String school);
	
}
