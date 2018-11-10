package com.example.simplejf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SimpleJFApplication {

    @RequestMapping(value="/jf", method = RequestMethod.GET)
    public String simpleJF() {
        return "I am a project that will be automated with pipeline as code using groovy in Jenkins file";
    }

    public static void main(String[] args) {
        SpringApplication.run(SimpleJFApplication.class, args);
    }
}
