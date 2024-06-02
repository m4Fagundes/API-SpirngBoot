package com.brincandocomspringboot.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brincandocomspringboot.springboot.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

    
}
