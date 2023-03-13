package com.ashokit.producer.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.producer.model.Student;
import com.ashokit.producer.service.ProducerService;

@RestController
public class ProducerController {

	@Autowired
	ProducerService service;
	
	@PostMapping("/send")
	public ResponseEntity<String> sendMessage(@RequestBody @Valid Student student)
	{
		service.sendMessage(student);
		return ResponseEntity.status(HttpStatus.CREATED).body("Student Object is sent to Kafka");
	}
}
