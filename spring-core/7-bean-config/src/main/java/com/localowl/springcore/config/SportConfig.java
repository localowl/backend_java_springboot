package com.localowl.springcore.config;

import com.localowl.springcore.common.Coach;
import com.localowl.springcore.common.TennisCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean //@Bean use case; take existing third-party class and expose as a Spring Bean
    public Coach tennisCoach(){
        return new TennisCoach();
    }
}
