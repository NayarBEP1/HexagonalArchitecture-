package com.example.demo.infrastructure.configuration;

import com.example.demo.domain.port.RepositoryUser;
import com.example.demo.domain.service.user.ServiceCreateUser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanServiceUser {

    @Bean
    public ServiceCreateUser serviceCreateUser(RepositoryUser repositoryUser){
        return new ServiceCreateUser(repositoryUser);
    }
}
