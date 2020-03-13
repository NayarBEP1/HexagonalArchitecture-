package com.example.demo.application.handler.user;

import com.example.demo.application.factory.FactoryUser;
import com.example.demo.application.handler.command.CommandUser;
import com.example.demo.domain.service.user.ServiceCreateUser;
import org.springframework.stereotype.Component;

@Component
public class HandlerCreateUser {

    private ServiceCreateUser serviceCreateUser;

    public HandlerCreateUser(ServiceCreateUser serviceCreateUser) {
        this.serviceCreateUser = serviceCreateUser;
    }

    public void run(CommandUser commandUser){
        this.serviceCreateUser.run(FactoryUser.create(commandUser));
    }
}
