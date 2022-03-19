package com.redisCache;

import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("student")
public class Student implements Serializable {
    public Student() {
    }

    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
