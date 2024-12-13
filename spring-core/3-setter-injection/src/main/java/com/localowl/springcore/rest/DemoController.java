package com.localowl.springcore.rest;

import com.localowl.springcore.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //
public class DemoController {
    // define a private field for the dependency
    private Coach myCoach;

    //field injection is not recommended by spring.io dev team
    //makes the code harder to unit test
    /*@Autowired
    private Coach coach;  -> field injection example*/

    // define a setter method for dependency injection
    @Autowired // this annotation tells Spring to inject a dependency
    public void setCoach(Coach theCoach) {
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkOut() {
        return myCoach.getDailyWorkOut();
    }
}
