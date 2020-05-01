package com.example.demo.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.UserActivity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.kafka.core.KafkaTemplate;

@Service
public class UserLogService {

    @Autowired
    KafkaTemplate<String, UserActivity> kafkaTemplate;

/*    @Bean
    public NewTopic adviceTopic(){
        return new NewTopic("user-log",3,(short)1);
    }*/

    private String topic = "user-log";

    public String produceMessage(UserActivity userActivity){
        ObjectMapper mapper = new ObjectMapper();
        kafkaTemplate.send(topic, userActivity);
        return "Message Published";
    }
}
