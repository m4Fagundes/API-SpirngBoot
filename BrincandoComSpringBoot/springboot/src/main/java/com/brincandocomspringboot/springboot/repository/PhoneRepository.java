package com.brincandocomspringboot.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brincandocomspringboot.springboot.model.Phone;

public interface PhoneRepository extends JpaRepository<Phone, Long>{

}
