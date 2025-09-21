package com.example.user.demo.user.controller;

import com.example.user.demo.user.Repo.UserRepository;
import jdk.jfr.Frequency;
import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserController {
    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @PostMapping("create")
    public ResponseEntity<User> createUser(
            @RequestBody User user
    ){
        User save = userRepository.save(user);
        return new ResponseEntity<>(save, HttpStatus.OK);
    }
}
