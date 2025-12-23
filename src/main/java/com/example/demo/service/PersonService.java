package com.example.works.service;

import com.example.works.entity.Person;
import java.util.List;

public interface PersonService {

    Person savePerson(Person person);

    List<Person> getPersons();

    Person getPersonById(Long id);
}
