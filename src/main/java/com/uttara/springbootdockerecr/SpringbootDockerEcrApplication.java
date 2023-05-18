package com.uttara.springbootdockerecr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDockerEcrApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDockerEcrApplication.class, args);
    }
    @GetMapping
    public String applicationStatus() {
        return "Application is up and running !";
    }

    @GetMapping("/{name}")
    public String welcome(@PathVariable String name) {
        return "Hi " + name + " Welcome to uttara AWS ECS Example";
    }

}
