package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long>{

	Student getByName(String name);

	Student getBySchool(String school);

	Student getByStandard(String standard);

}
