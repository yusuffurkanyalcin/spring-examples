package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public String getMessage(String param){
        System.out.println("Method is getMessage() param : "+param);
        return param;
    }
}
