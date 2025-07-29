package com.mehran.first.demo.app.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class FunRestController {
    //expose "/" that return "Hello World"

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    //expose "/workout" that return "today is workout day"
    @GetMapping("/workout")
    public String getMethodName() {
        return "today is workout day";
    }
    
    

}
