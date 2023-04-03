package com.example.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * '@RestController': This annotation is used to mark a class as a RESTful controller.
 * It's used to handle incoming HTTP requests and send back a response.
 */
@RestController
public class DemoController {
    // define a private field for the dependency

    private Coach myCoach;

    /**
     * '@Autowired': This annotation is used to inject a dependency into a Spring bean.
     * It's used to declare a dependency on another bean or a value that Spring Boot should provide.
     */
    @Autowired
    public DemoController(Coach theCoach) {
        myCoach = theCoach;
    }

    /**
     * '@RequestMapping': This annotation is used to map a URL request to a controller method.
     */
    @GetMapping("/dailyworkouts")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
