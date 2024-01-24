package com.example.demo.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	
	private long id;
	
	private String name ;
	
	private int marks;
	
	private String address;
	
	private String standard;
	
	private String school;
}
