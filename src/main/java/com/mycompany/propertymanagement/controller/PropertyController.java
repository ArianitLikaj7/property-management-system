package com.mycompany.propertymanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/properities")
public class PropertyController {

    @GetMapping("/hello")
    public String sayHello(){
        return "HELLO";
    }
}
