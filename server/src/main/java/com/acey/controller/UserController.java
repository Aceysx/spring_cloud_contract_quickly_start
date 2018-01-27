package com.acey.controller;

import com.acey.entities.User;
import com.acey.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users/{id}")
    ResponseEntity getUser(@PathVariable Long id) {
        User user = userService.getUser(id);
        return new ResponseEntity(user, HttpStatus.OK);
    }

    @PostMapping("/users")
    ResponseEntity addUser(@RequestBody User user) {
        userService.addUser(user);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
