package com.sample.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "topic1", groupId = "test-group")
    public void listen(String message) {
        System.out.println("Received: " + message);
    }
}

