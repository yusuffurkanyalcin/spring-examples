package restclient.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/client")
public class RestClientController {

    private static final String url = "http://localhost:8080/user";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public List<?> getUserList(){
        List<?> takenList = (List<?>) restTemplate.getForObject(url,Object.class);
       return takenList;
    }

    @PostMapping
    public void add(@RequestBody Object user){
        restTemplate.postForObject(url,user,Object.class);
    }
}
