//package com.example.demo.Controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.Dto.Employee;
//import com.example.demo.Feign.EmployeeFeignUtil;
//
//
////@RestController
//@RequestMapping("/feignEmployee")
//public class FeignEmpController {
//
//	@Autowired
//	private EmployeeFeignUtil ef;
//	
//
//	@PostMapping("/")
//	public ResponseEntity<?> addEmp(@RequestBody Employee emp)
//	{
//		return new ResponseEntity<>(ef.addEmp(emp),HttpStatus.CREATED);
//	}
//	
//	@GetMapping("/Allemployee")
//	public ResponseEntity<?> findAll()
//	{
//		return new ResponseEntity<>(ef.findAll(),HttpStatus.OK);
//	}
//	
//	@GetMapping("/findemployee/{id}")
//	public ResponseEntity<?> findById(@PathVariable Integer id)
//	{
//		return new ResponseEntity<>(ef.findById(id),HttpStatus.OK);
//	}
//	
//	@PutMapping("/editemployee")
//	public ResponseEntity<?> editEmployee(@RequestBody Employee emp)
//	{
//		return new ResponseEntity<>(ef.editEmployee(emp),HttpStatus.CREATED);
//	}
//	
//	@DeleteMapping("delete/{id}")
//	public ResponseEntity<?> deleteEmp(@PathVariable Integer id)
//	{
//		return new ResponseEntity<>(ef.deleteEmp(id),HttpStatus.OK);
//	}
//}
