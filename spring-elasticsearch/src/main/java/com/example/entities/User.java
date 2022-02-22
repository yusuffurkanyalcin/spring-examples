package com.example.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

@Document(indexName = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    private String id;

    @Field(name = "firstName",type = FieldType.Text)
    private String firstName;

    @Field(name = "lastName",type = FieldType.Text)
    private String lastName;

    @Field(name = "address",type = FieldType.Text)
    private String address;

    @Field(name = "birthday",type = FieldType.Date)
    private Date birthday;
}
