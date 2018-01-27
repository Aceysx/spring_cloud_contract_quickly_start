package com.acey.service;

import com.acey.entities.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User getUser(Long id) {
        return new User(1L, "acey");
    }

    public void addUser(User user) {

    }
}
