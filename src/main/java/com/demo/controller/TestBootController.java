package com.demo.controller;



import com.demo.entity.User;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestBootController {
    @PostMapping("getuser")
    public User getUser() {
        User user = new User();
        user.setUserName("test");
        return user;
    }
}
