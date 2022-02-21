package com.example.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;

@Document
@Data
public class User {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private HashMap features;
}
