package com.localowl.springcore.common;

public class TennisCoach implements Coach{

    public TennisCoach(){
        System.out.println("In constructor: " +getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkOut() {
        return "Tennis";
    }
}

//TennisCoach did not have @Component
//Instead, we configured as a Spring bean using @Bean