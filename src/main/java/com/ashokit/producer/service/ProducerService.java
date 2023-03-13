package com.ashokit.producer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.ashokit.producer.model.Student;

@Service
public class ProducerService {

	@Autowired
	KafkaTemplate<String, Student> kafkaTemplate;
	
	@Value("${topic.name}")
	String topic;
	
	public void sendMessage(Student student)
	{
		kafkaTemplate.send(topic, student);
	}
}
