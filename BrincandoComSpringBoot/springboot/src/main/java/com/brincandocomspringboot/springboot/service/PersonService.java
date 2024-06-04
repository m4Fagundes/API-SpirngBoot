package com.brincandocomspringboot.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brincandocomspringboot.springboot.model.Person;
import com.brincandocomspringboot.springboot.repository.PersonRepository;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Person save(Person person){
        return personRepository.save(person);
    }

    public Person findById(Long id){
        return personRepository.findById(id).orElse(null);
    }

    public List<Person> findAll(){
        return personRepository.findAll();
    }
}
