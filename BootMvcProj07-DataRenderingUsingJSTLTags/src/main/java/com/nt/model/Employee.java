package com.nt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {


	private Integer eno;
	private String ename;
	private Double salary;
	private Boolean vaccinated;
}
