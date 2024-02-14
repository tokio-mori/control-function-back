package com.example.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fullstackbackend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
