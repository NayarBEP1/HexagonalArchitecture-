package com.example.demo.infrastructure.adapter.mapper;

import com.example.demo.domain.model.User;
import com.example.demo.infrastructure.entity.EntityUser;

public class MapperUser {

    public static EntityUser modelToEntity(User user){
        return new EntityUser(user.getName(), user.getLastName());
    }
}
