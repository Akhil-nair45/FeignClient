package com.example.demo.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	private int eid;
	
	private String name;
	
	private String company;
	
	private String address;
	
	private long salary;
}