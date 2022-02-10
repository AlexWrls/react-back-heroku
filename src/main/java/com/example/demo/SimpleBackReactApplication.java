package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleBackReactApplication implements ApplicationRunner {
    @Autowired
    private PersonRepo personRepo;

    public static void main(String[] args) {
        SpringApplication.run(SimpleBackReactApplication.class, args);
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {
        Person person = new Person();
        person.setFirstName("Person1 FirstName");
        person.setLastName("Person1 LastName");
        Person person2 = new Person();
        person2.setFirstName("Person2 FirstName");
        person2.setLastName("Person2 LastName");
        personRepo.save(person);
        personRepo.save(person2);
    }
}
