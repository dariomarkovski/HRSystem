package com.finki.soa.group3.HRSystem.service.archive.person;

import com.finki.soa.group3.HRSystem.model.Person;

public interface PersonService {

    Person save(Person person);
    void delete(Long id);
    Iterable<Person> getAllPersons();

}
