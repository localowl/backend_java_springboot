package com.localowl.util;

import org.springframework.stereotype.Component;

@Component // this annotation marks the class as a Spring Bean
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkOut() {
        return "Practice fast bowling for 10 minutes!";
    }

}
