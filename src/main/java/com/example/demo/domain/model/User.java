package com.example.demo.domain.model;

public class User {

    private Long id;
    private String name;
    private String lastName;

    public User(String name, String lastName) {
        validateData(name, lastName);
        this.name = name;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    private void validateData(String name, String lastName){
        DataValidator.validateNull(name, "Error: el nombre es necesario");
        DataValidator.validateNull(lastName, "Error: el apellido es necesario");
    }
}
