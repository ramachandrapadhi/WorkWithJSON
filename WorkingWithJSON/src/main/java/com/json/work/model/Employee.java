package com.json.work.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	private String name;
	private Integer age;
	private String gender;
	private String qualification;
	private Address address;
}
