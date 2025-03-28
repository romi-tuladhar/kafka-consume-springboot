package com.example.springboot_kafka_consume.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    private static  final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "customer.new", groupId = "new-customer-event-consumer")
    public void consume(String message){
        LOGGER.info("New customer registration event acknowledged for {}", message);
    }
}
