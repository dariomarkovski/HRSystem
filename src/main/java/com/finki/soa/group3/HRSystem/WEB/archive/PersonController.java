package com.finki.soa.group3.HRSystem.WEB.archive;

import com.finki.soa.group3.HRSystem.model.Person;
import com.finki.soa.group3.HRSystem.model.archive.exceptions.PersonNotFoundException;
import com.finki.soa.group3.HRSystem.service.archive.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
@RequestMapping(value = "/person")
public class PersonController {

    @Autowired
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    Person addNewPerson(@ModelAttribute Person person){
        return this.personService.save(person);
    }

    @DeleteMapping(value = "/{id}")
    void delete(@PathVariable("id") Long id){
        this.personService.delete(id);
    }

    @GetMapping
    Iterable<Person> getAllPersons(){
        return this.personService.getAllPersons();
    }

    @GetMapping(value = "/{id}")
    Person findById(@PathVariable("id") Long id) throws PersonNotFoundException {
        return this.personService.getById(id);
    }
}
