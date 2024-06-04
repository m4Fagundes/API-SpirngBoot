package com.brincandocomspringboot.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.brincandocomspringboot.springboot.model.Person;
import com.brincandocomspringboot.springboot.service.PersonService;


@RestController
@RequestMapping(value = "/person")
public class PersonControler {
    

    @Autowired
    private PersonService personService;

    @PostMapping(value = "/save")
    public ResponseEntity<Person> savePerson(@RequestParam Person person){
        
        personService.save(person);
        return ResponseEntity.ok().body(person);

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Person> getPerson(Person person){
        
        personService.save(person);
        return ResponseEntity.ok().body(person);

    }
}
