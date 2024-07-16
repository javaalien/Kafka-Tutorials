package com.alien.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.alien.constant.AppConstants;
import com.alien.model.Order;

@Service
public class OrderService {

	@Autowired
	private KafkaTemplate<String, Order> kafkaTemplate;


	public String addMsg(Order order) {
		kafkaTemplate.send(AppConstants.TOPIC, order);
		return "Msg Published To Kafka Topic";
	}
}
