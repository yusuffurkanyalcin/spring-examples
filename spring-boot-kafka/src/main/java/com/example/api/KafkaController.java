package com.example.api;

import com.example.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    private ProducerService producerService;

    @GetMapping("/{msg}")
    public void sendMessage(@PathVariable("msg") String message){
        producerService.sendMessage(message);
    }
}
