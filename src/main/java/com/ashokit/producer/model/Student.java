package com.ashokit.producer.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

	@NotNull
	private Integer id;
	
	@NotEmpty
	private String name;
	
	@NotEmpty
	@Email
	private String email;
}
