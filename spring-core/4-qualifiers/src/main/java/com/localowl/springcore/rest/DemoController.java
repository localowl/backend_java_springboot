package com.localowl.springcore.rest;

import com.localowl.springcore.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //
public class DemoController {
    // define a private field for the dependency
    private Coach myCoach;

    @Autowired // this annotation tells Spring to inject a dependency
    public DemoController(@Qualifier("baseballCoach") Coach theCoach) {
        //@Qualifier annotation is used when more than one class implements an interface
        // However, if we use the @Qualifier annotation to specify another class,
        // the class specified by @Qualifier will override the class marked with @Primary.
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkOut() {
        return myCoach.getDailyWorkOut();
    }
}
