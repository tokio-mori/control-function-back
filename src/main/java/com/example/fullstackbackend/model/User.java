package com.example.fullstackbackend.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @JsonProperty("user_name")
    private String username;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("email")
    private String email;
}
