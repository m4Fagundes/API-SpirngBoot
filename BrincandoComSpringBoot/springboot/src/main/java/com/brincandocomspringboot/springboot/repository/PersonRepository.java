package com.brincandocomspringboot.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brincandocomspringboot.springboot.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

}
