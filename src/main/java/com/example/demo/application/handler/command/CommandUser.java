package com.example.demo.application.handler.command;

public class CommandUser {

    private String name;
    private String lastName;

    public CommandUser(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
}
