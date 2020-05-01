package com.example.demo.service;

import com.example.demo.repository.UserActivityRepository;
import model.UserActivity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class UserActivityService {

    @Autowired
    UserActivityRepository userActivityRepository;

    private final String topic = "user-log";

    @KafkaListener(topics = topic, groupId = "groupId",
            containerFactory = "kafkaListenerContainerFactory")
    public void consume(UserActivity user){
       System.out.println("Consumed message: "+user);

        UserActivity userActivity = user;
        userActivityRepository.save(userActivity);
        Logger logger = LoggerFactory.getLogger(UserActivityService.class);
        logger.info(user + " - Record Inserted");

    }
}
