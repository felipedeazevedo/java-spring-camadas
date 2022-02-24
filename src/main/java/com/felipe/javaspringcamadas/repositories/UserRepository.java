package com.felipe.javaspringcamadas.repositories;

import com.felipe.javaspringcamadas.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
