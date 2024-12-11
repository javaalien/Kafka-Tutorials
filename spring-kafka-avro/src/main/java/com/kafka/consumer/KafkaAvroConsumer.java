package com.kafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.stereotype.Service;

import com.kafka.dto.Employee;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class KafkaAvroConsumer {

	public void read(ConsumerRecord<String, Employee> consumerRecord) {
		String key = consumerRecord.key();
		Employee employee = consumerRecord.value();
		log.info("Avro message received for key : " + key + " value : " + employee.toString());
	}
}
