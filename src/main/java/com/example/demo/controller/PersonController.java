package com.example.works.controller;

import com.example.works.entity.Person;
import com.example.works.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping
    public Person createPerson(@RequestBody Person person) {
        return personService.savePerson(person);
    }

    @GetMapping
    public List<Person> fetchPersons() {
        return personService.getPersons();
    }

    @GetMapping("/{id}")
    public Person fetchPersonById(@PathVariable Long id) {
        return personService.getPersonById(id);
    }
}
