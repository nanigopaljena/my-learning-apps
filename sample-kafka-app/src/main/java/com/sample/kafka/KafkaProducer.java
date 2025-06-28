package com.sample.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(String topic, String message) {
        kafkaTemplate.send(topic, message);
    }

    @Scheduled(fixedRate = 5000)
    public void scheduledSend() {
        String topic = "topic1";
        String message = "Scheduled message at " + System.currentTimeMillis();
        send(topic, message);
        System.out.println("Sent: " + message);
    }
}
