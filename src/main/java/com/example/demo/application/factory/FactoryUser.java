package com.example.demo.application.factory;

import com.example.demo.application.handler.command.CommandUser;
import com.example.demo.domain.model.User;

public class FactoryUser {

    public static User create(CommandUser commandUser) {
        return new User(commandUser.getName(), commandUser.getLastName());
    }
}
