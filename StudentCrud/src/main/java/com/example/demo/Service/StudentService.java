package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Student;

public interface StudentService {

	public Student addStudent(Student student);
	
	public List<Student> getAllStudent();
	
	public Student getStudentById(Long id);
	
	public Student editStudent(Student student);
	
	public String deleteStudent(Long id);
	
	public Student getStudentByName(String name);
	
	public Student getStudentBySchool(String school);
	
	public Student getStudentByStandard (String standard);
	
	
	
}
