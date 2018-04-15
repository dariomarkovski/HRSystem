package com.finki.soa.group3.HRSystem.service.archive.Implementation;

import com.finki.soa.group3.HRSystem.model.Person;
import com.finki.soa.group3.HRSystem.model.archive.exceptions.PersonNotFoundException;
import com.finki.soa.group3.HRSystem.persistence.person.PersonRepository;
import com.finki.soa.group3.HRSystem.service.archive.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonServiceImplementation implements PersonService{
    @Autowired
    private final PersonRepository repository;

    public PersonServiceImplementation(PersonRepository repository) {
        this.repository = repository;
    }

    @Override
    public Person save(Person person) {
        return repository.save(person);
    }

    @Override
    public Person getById(Long id) throws PersonNotFoundException {
       Optional<Person> person = this.repository.findById(id);
       return person.orElseThrow(() -> new PersonNotFoundException(id));
    }

    @Override
    public void delete(Long id) {
        this.repository.deleteById(id);
    }

    @Override
    public Iterable<Person> getAllPersons() {
        return repository.findAll();
    }
}
