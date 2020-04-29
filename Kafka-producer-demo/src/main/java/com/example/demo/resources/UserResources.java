package com.example.demo.resources;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class UserResources {

    @Autowired
    KafkaTemplate<String, User> kafkaTemplate;

    private static final String TOPIC = "testTopic";

    @GetMapping("/publish/{firstName}")
    public String post(@PathVariable("firstName")String firstName){

        kafkaTemplate.send(TOPIC,new User(firstName, "Das", 30));

        return "Published successfully";
    }
}
