package com.nt.model;

import lombok.Data;

@Data
public class Student {

	private Integer sno;
	private String sname;
	private String sadd = "Hyderabad";
	private float avg;
}
