package com.localowl.springcore.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy //This annotation ensures that the bean is not created until it is needed
public class BasketballCoach implements Coach{
    @Override
    public String getDailyWorkOut() {
        return "Spend 1 hour for basketball ";
    }
}
