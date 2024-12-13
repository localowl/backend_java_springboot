package com.localowl.springcore.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component // this annotation marks the class as a Spring Bean
@Primary // this annotation marks the primary class.
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkOut() {
        return "Practice fast bowling for 10 minutes!";
    }

}
