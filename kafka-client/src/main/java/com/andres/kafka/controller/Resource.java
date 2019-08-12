package com.andres.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class Resource {
	String topicName = "first_topic";
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	@GetMapping("/publish/{messages}")
	public String post(@PathVariable("messages")String msg) {
		
		kafkaTemplate.send(topicName , msg);
		
		for (int i = 0; i < 200; i++) {
			kafkaTemplate.send(topicName , msg+""+i);
		}
		
		return "Oks";
	}
}
