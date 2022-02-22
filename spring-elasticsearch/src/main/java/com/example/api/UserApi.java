package com.example.api;

import com.example.entities.User;
import com.example.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Calendar;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserApi {

    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public void init(){
        User user =  new User();
        user.setFirstName("Furkan");
        user.setLastName("Yalcin");
        user.setAddress("Elazig");
        user.setBirthday(Calendar.getInstance().getTime());
        user.setId("K0001");
        userRepository.save(user);
    }

    @GetMapping("/{search}")
    public ResponseEntity<List<User>> getAll(@PathVariable("search") String search){
        List<User> users = userRepository.getByCustomQuery(search);
        return ResponseEntity.ok(users);
    }
}
