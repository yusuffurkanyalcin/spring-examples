package com.example.api;

import com.example.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aop")
public class MessageApi {

    @Autowired
    private MessageService messageService;

    @PostMapping
    public ResponseEntity<String> getMessage(@RequestBody String message){
        return ResponseEntity.ok(messageService.getMessage(message));
    }
}
