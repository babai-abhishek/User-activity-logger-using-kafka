package com.example.demo.service;

import com.example.demo.entity.UserActivity;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
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
