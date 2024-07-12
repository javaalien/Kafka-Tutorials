package com.avro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.avro.dto.Student;
import com.avro.producer.SpringAvroProducer;

@RestController
public class KafkaAvroController {

	@Autowired
	private SpringAvroProducer producer;

	@PostMapping("/events")
	public String sendKafkaEvents(@RequestBody Student student) {
		try {

			producer.send(student);
			return "Message published.";

		} catch (Exception e) {
			throw new RuntimeException("Exception occurred : " + e.getMessage());
		}
	}

}
