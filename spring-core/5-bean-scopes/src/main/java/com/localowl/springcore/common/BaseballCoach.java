package com.localowl.springcore.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//Spring beans are singleton beans
public class BaseballCoach implements Coach{
    @Override
    public String getDailyWorkOut() {
        return "Spend 30 minutes for baseball";
    }
}


//Prototype creates a new bean instance for each container request
//Request scoped to an HTTP web request. Only used for web apps
//Session scoped to an HTTP web session. Only used for web apps
//Application scoped to a web app ServletContext. Only used for web apps
//Websocket scoped to a web socket. Only used for web apps