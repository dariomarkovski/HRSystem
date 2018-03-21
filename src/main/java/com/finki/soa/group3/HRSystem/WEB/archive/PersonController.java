package com.finki.soa.group3.HRSystem.WEB.archive;

import com.finki.soa.group3.HRSystem.model.Person;
import com.finki.soa.group3.HRSystem.service.archive.person.PersonService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/person")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping(value = "/addPerson")
    Person addNewPerson(@ModelAttribute Person person){
        return this.personService.save(person);
    }

    @DeleteMapping(value = "/delete/{id}")
    void delete(@PathVariable("id") Long id){
        this.personService.delete(id);
    }

    @GetMapping(value = "/getAllPersons")
    Iterable<Person> getAllPersons(){
        return this.personService.getAllPersons();
    }

}
