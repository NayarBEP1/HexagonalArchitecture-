package com.example.demo.infrastructure.jparepository;

import com.example.demo.infrastructure.entity.EntityUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaUser extends JpaRepository<EntityUser, Long> {
}
