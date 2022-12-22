package com.dca.dca.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class HelloWorldController {

    @GetMapping("/hello")
    public String saludo(){
        return "hola, que tal";
    }

}
