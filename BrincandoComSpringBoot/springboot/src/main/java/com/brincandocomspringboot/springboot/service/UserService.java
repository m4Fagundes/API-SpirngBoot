package com.brincandocomspringboot.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.brincandocomspringboot.springboot.model.User;
import com.brincandocomspringboot.springboot.repository.UserRepository;

@Service
public class UserService {


    @Autowired
    public UserRepository userRepository;

    public ResponseEntity<User> addUser(User user) {
        return new ResponseEntity<>(userRepository.save(user), HttpStatus.OK);
    }

    
}
