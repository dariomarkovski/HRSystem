package com.finki.soa.group3.HRSystem.service.archive.person.Implementation;

import com.finki.soa.group3.HRSystem.model.Person;
import com.finki.soa.group3.HRSystem.persistence.person.PersonRepository;
import com.finki.soa.group3.HRSystem.service.archive.person.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImplementation implements PersonService{
    @Autowired
    private final PersonRepository repository;

    public PersonServiceImplementation(PersonRepository repository) {
        this.repository = repository;
    }

    @Override
    public Person save(Person person) {
     return this.repository.save(person);
    }

    @Override
    public void delete(Long id) {
        this.repository.deleteById(id);
    }

    @Override
    public Iterable<Person> getAllPersons() {
        return this.repository.findAll();
    }
}
