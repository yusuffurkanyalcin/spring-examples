package server.api;

import org.springframework.web.bind.annotation.*;
import server.entity.User;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    ArrayList<User> list;

    public UserController(){
        list=new ArrayList<>();
        list.add(new User(1,"Furkan","Yalçın"));
        list.add(new User(2,"Aleyna","Yalçın"));
        list.add(new User(3,"Veysel","Yalçın"));
    }
    @GetMapping
    public List<User> getAll(){
        return list;
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable("id")int id){
        return list.stream().filter(user -> user.getId()==id).findFirst().get();
    }

    @PostMapping
    public void addUSer(@RequestBody User user){
        list.add(user);
    }
}
