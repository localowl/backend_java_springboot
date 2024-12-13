package com.localowl.springcore.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach{
    @Override
    public String getDailyWorkOut() {
        return "Spend 1 hour for basketball ";
    }
}
