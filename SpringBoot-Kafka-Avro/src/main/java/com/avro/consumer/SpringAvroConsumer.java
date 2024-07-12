package com.avro.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.stereotype.Service;

import com.avro.dto.Student;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SpringAvroConsumer {

	public void read(ConsumerRecord<String, Student> record) {
		String key = record.key();
		Student student = record.value();

		log.info("Avro message recieved for key :" + key + " value : " + student.toString());
	}

}
