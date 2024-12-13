package com.localowl.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
    @Override
    public String getDailyWorkOut() {
        return "Spend 30 minutes for baseball";
    }
}
