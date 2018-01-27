package com.acey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class ClientApp {
    public static void main(String[] args) {
        System.out.println("consumer : Using spring contract..." + new Date().getTime());
        SpringApplication.run(ClientApp.class, args);
    }
}
