package com.example.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fullstackbackend.model.Feature;

@Repository
public interface FeatureRepository extends JpaRepository<Feature, Long> {
}
