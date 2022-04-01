package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = "${kafka.topic}",groupId = "${kafka.group.id}")
    public void listenGroupDummy(String msg){
        System.out.println("Received message in group dummy : "+msg);
    }
}
