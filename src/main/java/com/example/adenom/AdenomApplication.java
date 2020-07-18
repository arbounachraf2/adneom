package com.example.adenom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;



@SpringBootApplication
@EnableScheduling
public class AdenomApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdenomApplication.class, args);
    }
}
