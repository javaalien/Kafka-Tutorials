package com.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.producer.model.User;

@RestController
@RequestMapping("/kafka-publisher")
public class PublisherController {

	private String TOPIC = "kafka-example";

	@Autowired
	private KafkaTemplate<String, Object> template;

	@GetMapping("/publish/{input}")
	public String publishMessage(@PathVariable String input) {
		template.send(TOPIC, "Hi  " + input + " welcome to Java Techie");
		return "Data published";
	}

	@GetMapping("/publishObject")
	public String publishJsonMessage() {
		template.send(TOPIC, new User(123, "Chetan Malabade",
				new String[] { "Pune", "Hinjewadi", "Phase 1", "house no : 123", "511057" }));
		return "Json Data published";
	}
}
