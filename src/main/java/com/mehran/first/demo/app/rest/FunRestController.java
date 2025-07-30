package com.mehran.first.demo.app.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class FunRestController {
    //expose "/" that return "Hello World"

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Team Coach: " + coachName + " and Team Name: " + teamName;
    }
    

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
