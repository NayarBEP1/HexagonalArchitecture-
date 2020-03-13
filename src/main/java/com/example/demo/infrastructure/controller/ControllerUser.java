package com.example.demo.infrastructure.controller;

import com.example.demo.application.handler.command.CommandUser;
import com.example.demo.application.handler.user.HandlerCreateUser;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class ControllerUser {

    private HandlerCreateUser handlerCreateUser;

    public ControllerUser(HandlerCreateUser handlerCreateUser) {
        this.handlerCreateUser = handlerCreateUser;
    }

    @PostMapping
    public void create(@RequestBody CommandUser commandUser) {
        this.handlerCreateUser.run(commandUser);
    }
}
