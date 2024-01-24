package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	
	private String name;
	
	private String company;
	
	private String address;
	
	private long salary;
	
}
