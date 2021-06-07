package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;

@Service
public class Producer {
	
	public static final String topic = "myTopic";
	
	@Autowired
	private KafkaTemplate<String, Employee>  kafkaTemplate;
	
	public void publishTopic(Employee employee) {
		try {
			kafkaTemplate.send(topic,employee);
			System.out.println("Message published.");
		} catch (Exception e) {
			System.err.println("Error in publishing");
		}
		
	}

}
