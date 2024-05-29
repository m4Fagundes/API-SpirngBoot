package com.brincandocomspringboot.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloTeste {

    @GetMapping("/")
    public String helloTeste(){
        return "Isso é apenas um teste";
    }

}
