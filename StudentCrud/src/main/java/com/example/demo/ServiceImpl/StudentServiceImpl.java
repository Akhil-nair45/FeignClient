package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepo;
import com.example.demo.Service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo sr;
	
	@Override
	public Student addStudent(Student student) {
		return sr.save(student);
	}

	@Override
	public List<Student> getAllStudent() {
		return sr.findAll();
	}

	@Override
	public Student getStudentById(Long id) {
		return sr.findById(id).get();
	}

	@Override
	public Student editStudent(Student student) {
		return sr.save(student);
	}

	@Override
	public String deleteStudent(Long id) {
		Student student = sr.findById(id).get();
		if(student!=null)
		{
			sr.delete(student);
			return "User deleted successfully!!!!";
		}
		return "Please enter correct ID";
	}

	@Override
	public Student getStudentByName(String name) {
		return sr.getByName(name);
	}

	@Override
	public Student getStudentBySchool(String school) {
		return sr.getBySchool(school);
	}

	@Override
	public Student getStudentByStandard(String standard) {
		return sr.getByStandard(standard);
	}

}
