package com.json.work.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
	
	private String line;
	private String locality;
	private String landMark;
	private Integer pinCode;
}
