package com.redisCache.api;

import com.redisCache.Student;
import com.redisCache.StudentRepository;
import com.redisCache.service.RedisCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class RedisCacheController {

    private int counter=0;

    @Autowired
    private RedisCacheService redisCacheService;

    @Autowired
    private StudentRepository repository;

    @GetMapping
    public String get() throws InterruptedException {
        if(counter==5){
            redisCacheService.removeCache();
            counter=0;
        }
        counter++;
        return redisCacheService.longWaiting();
    }

    @GetMapping("/add")
    public void add(){
        Student student = new Student("12345","Furkan");
       repository.save(student);
    }

    @Cacheable("student")
    @GetMapping("/come")
    public String getir() throws InterruptedException{
        Thread.sleep(5000);
        return repository.findById("12345").get().getName();
    }
}
