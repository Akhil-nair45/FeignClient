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

import com.example.demo.Entity.Student;
import com.example.demo.Service.StudentService;

@RestController
@RequestMapping("/crud")
public class StudentController {

	@Autowired
	private StudentService ss;
	
	@PostMapping("/")
	public ResponseEntity<?> addStudent(@RequestBody Student student)
	{
		return new ResponseEntity<>(ss.addStudent(student),HttpStatus.CREATED);
	}
	
	@GetMapping("/All")
	public ResponseEntity<?> getAllStudents()
	{
		return new ResponseEntity<>(ss.getAllStudent(),HttpStatus.OK);
	}
	
	@GetMapping("/id/{id}")
	public ResponseEntity<?> getStudentById(@PathVariable Long id)
	{
		return new ResponseEntity<>(ss.getStudentById(id),HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<?> updateStudent(@RequestBody Student student)
	{
		return new ResponseEntity<>(ss.editStudent(student),HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteStudenT(@PathVariable Long id )
	{
		return new ResponseEntity<>(ss.deleteStudent(id),HttpStatus.OK);
	}
	
	@GetMapping("/name/{name}")
	public ResponseEntity<?> findStudentByName(@PathVariable String name)
	{
		return new ResponseEntity<>(ss.getStudentByName(name),HttpStatus.OK);
	}
	
	@GetMapping("/standard/{standard}")
	public ResponseEntity<?> findStudentByStandard(@PathVariable String standard )
	{
		return new ResponseEntity<>(ss.getStudentByStandard(standard),HttpStatus.OK);
	}
	
	@GetMapping("/school/{school}")
	public ResponseEntity<?> findBySchool(@PathVariable String school)
	{
		return new ResponseEntity<>(ss.getStudentBySchool(school),HttpStatus.OK);
	}
	
	
}
