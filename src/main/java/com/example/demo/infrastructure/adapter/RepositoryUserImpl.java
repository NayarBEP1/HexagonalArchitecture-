package com.example.demo.infrastructure.adapter;

import com.example.demo.domain.model.User;
import com.example.demo.domain.port.RepositoryUser;
import com.example.demo.infrastructure.adapter.mapper.MapperUser;
import com.example.demo.infrastructure.jparepository.JpaUser;
import org.springframework.stereotype.Repository;

@Repository
public class RepositoryUserImpl implements RepositoryUser {

    private JpaUser jpaUser;
    private MapperUser mapperUser;

    public RepositoryUserImpl(JpaUser jpaUser) {
        this.jpaUser = jpaUser;
    }

    @Override
    public void create(User user) {
        this.jpaUser.save(MapperUser.modelToEntity(user));
    }

}
