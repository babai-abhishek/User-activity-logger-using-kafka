package com.example.demo.listener;

import model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "testTopic", groupId = "groupId",
            containerFactory = "kafkaListenerContainerFactory")
    public void consume(User user){
        System.out.println("Consumed message: "+user);
    }
}
