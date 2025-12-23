package com.example.demo.service;

import com.example.demo.entity.Person;
import java.util.List;

public interface PersonService {

    Person savePerson(Person person);

    List<Person> getPersons();

    Person getPersonById(Long id);
}
