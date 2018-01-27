package com.acey.controller;

import com.acey.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users/{id}")
    ResponseEntity getUser(@PathVariable Long id) {
        return new ResponseEntity(userService.getUserInfo(id), HttpStatus.OK);
    }

}
