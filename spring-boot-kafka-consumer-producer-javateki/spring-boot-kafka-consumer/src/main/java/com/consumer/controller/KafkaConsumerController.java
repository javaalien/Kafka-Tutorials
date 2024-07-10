package com.consumer.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consumer.model.User;

@RestController
@RequestMapping("/kafka-consumer")
public class KafkaConsumerController {

	List<String> messages = new ArrayList<>();
	List<User> users = new ArrayList<>();

	@GetMapping("/consume")
	public List<String> consumeStringResponse() {
		return getMessageFromTopic("Alien");
	}

	@GetMapping("/consumeJson")
	public List<User> consumeJsonResponse() {
		return getJsonObjectFromTopic(null);
	}

	@KafkaListener(topics = "kafka-example", groupId = "group_id")
	public List<String> getMessageFromTopic(String message) {
		System.out.println("Consuming :  " + message);
		messages.add(message);
		System.out.println("messages : " + messages);
		return messages;
	}

	@KafkaListener(topics = "kafka-example", groupId = "json_group_id", containerFactory = "userKafkaListenerContainerFactory")
	public List<User> getJsonObjectFromTopic(User user) {
		System.out.println("Consuming :  " + user);
		users.add(user);
		return users;
	}

}
