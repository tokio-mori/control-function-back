package com.example.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fullstackbackend.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
