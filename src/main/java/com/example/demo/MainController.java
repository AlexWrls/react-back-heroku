package com.example.demo;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class MainController {

    private final PersonRepo personRepo;

    @GetMapping("/main")
    public List<Person> persons() {
        return personRepo.findAll();
    }
}
