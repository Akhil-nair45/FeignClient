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

import com.example.demo.Dto.Employee;
import com.example.demo.Dto.Student;
import com.example.demo.Feign.EmployeeFeignUtil;
import com.example.demo.Feign.StudentFeignUtil;


@RestController
@RequestMapping("/Feign")
public class feignController {

	@Autowired
	private StudentFeignUtil sf;
	
	@Autowired
	private EmployeeFeignUtil ef;
	
	
	@PostMapping("/")
	public ResponseEntity<?> addStudent(@RequestBody Student student)
	{
		return new ResponseEntity<>(sf.addStudent(student),HttpStatus.CREATED);
	}
	
	@GetMapping("/All")
	public ResponseEntity<?> getAllStudents()
	{
		return new ResponseEntity<>(sf.getAllStudents(),HttpStatus.OK);
	}
	
	@GetMapping("/id/{id}")
	public ResponseEntity<?> getStudentById(@PathVariable Long id)
	{
		return new ResponseEntity<>(sf.getStudentById(id),HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<?> updateStudent(@RequestBody Student student)
	{
		return new ResponseEntity<>(sf.updateStudent(student),HttpStatus.CREATED);
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteStudenT(@PathVariable Long id )
	{
		return new ResponseEntity<>(sf.deleteStudenT(id),HttpStatus.OK);
	}
	
	
	@GetMapping("/name/{name}")
	public ResponseEntity<?> findStudentByName(@PathVariable String name)
	{
		return new ResponseEntity<>(sf.findStudentByName(name),HttpStatus.OK);
	}
	
	
	@GetMapping("/standard/{standard}")
	public ResponseEntity<?> findStudentByStandard(@PathVariable String standard )
	{
		return new ResponseEntity<>(sf.findStudentByStandard(standard),HttpStatus.OK);
	}
	
	
	@GetMapping("/school/{school}")
	public ResponseEntity<?> findBySchool(@PathVariable String school)
	{
		return new ResponseEntity<>(sf.findBySchool(school),HttpStatus.OK);
	}
	
	
	
	
	
	
	
	

	
	

	@PostMapping("/add")
	public ResponseEntity<?> addEmp(@RequestBody Employee emp)
	{
		return new ResponseEntity<>(ef.addEmp(emp),HttpStatus.CREATED);
	}
	
	@GetMapping("/Allemployee")
	public ResponseEntity<?> findAll()
	{
		return new ResponseEntity<>(ef.findAll(),HttpStatus.OK);
	}
	
	@GetMapping("/findemployee/{id}")
	public ResponseEntity<?> findById(@PathVariable Integer id)
	{
		return new ResponseEntity<>(ef.findById(id),HttpStatus.OK);
	}
	
	@PutMapping("/editemployee")
	public ResponseEntity<?> editEmployee(@RequestBody Employee emp)
	{
		return new ResponseEntity<>(ef.editEmployee(emp),HttpStatus.CREATED);
	}
	
	@DeleteMapping("delete/{id}")
	public ResponseEntity<?> deleteEmp(@PathVariable Integer id)
	{
		return new ResponseEntity<>(ef.deleteEmp(id),HttpStatus.OK);
	}
	
}
