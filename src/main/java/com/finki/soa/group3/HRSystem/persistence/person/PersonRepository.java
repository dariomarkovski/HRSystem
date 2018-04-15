package com.finki.soa.group3.HRSystem.persistence.person;

import com.finki.soa.group3.HRSystem.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {

}
