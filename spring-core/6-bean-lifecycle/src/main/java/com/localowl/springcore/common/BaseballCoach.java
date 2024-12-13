package com.localowl.springcore.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{

    //define our init method
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("In doMyStartupStuff: " + getClass().getSimpleName());
    }

    //define our destroy method
    @PreDestroy
    public void doMyCleanStuff(){
        System.out.println("In doMyCleanStuff: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkOut() {
        return "Spend 30 minutes for baseball";
    }
}
