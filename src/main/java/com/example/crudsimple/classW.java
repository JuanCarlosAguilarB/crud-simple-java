package com.example.crudsimple;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class classW {
    @GetMapping("/")
    public String index() {
        return "😒Gree nooo siiii asdasd otings from Spring Boot!";
    }
}
