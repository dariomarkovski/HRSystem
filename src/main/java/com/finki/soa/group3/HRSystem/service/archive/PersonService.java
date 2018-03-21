package com.finki.soa.group3.HRSystem.service.archive;

import com.finki.soa.group3.HRSystem.model.Person;
import com.finki.soa.group3.HRSystem.model.archive.exceptions.PersonNotFoundException;

public interface PersonService {

    Person save(Person person);
    Person getById(Long id) throws PersonNotFoundException;
    void delete(Long id);
    Iterable<Person> getAllPersons();

}
