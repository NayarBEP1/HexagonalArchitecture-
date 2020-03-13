package com.example.demo.domain.service.user;

import com.example.demo.domain.model.User;
import com.example.demo.domain.port.RepositoryUser;

public class ServiceCreateUser {

    private RepositoryUser repositoryUser;

    public ServiceCreateUser(RepositoryUser repositoryUser){
        this.repositoryUser = repositoryUser;
    }

    public void run(User user){
        this.repositoryUser.create(user);
    }
}
