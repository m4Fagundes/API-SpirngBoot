package com.brincandocomspringboot.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brincandocomspringboot.springboot.model.User;
import com.brincandocomspringboot.springboot.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    public UserService userService;


    @PostMapping("/addUser")
    public ResponseEntity<User> addExpense(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("userTeste")
    public String testeUser(){
        return "isso é apenas um teste";
    }

}
