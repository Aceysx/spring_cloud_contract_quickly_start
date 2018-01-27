package com.acey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class ServiceApp {
    public static void main(String[] args) {
        System.out.println("provider : Using spring contract..." + new Date().getTime());
        SpringApplication.run(ServiceApp.class, args);
    }
}
