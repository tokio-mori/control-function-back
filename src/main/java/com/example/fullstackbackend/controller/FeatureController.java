package com.example.fullstackbackend.controller;

import java.sql.ResultSet;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.fullstackbackend.model.Feature;
import com.example.fullstackbackend.repository.FeatureRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@CrossOrigin("http://localhost:3000/")
public class FeatureController {

    Logger logger = LoggerFactory.getLogger(FeatureController.class);

    ResultSet resultSet;
    @Autowired
    private FeatureRepository featureRepository;

    @GetMapping("/")
    public List<Feature> feature() {

        logger.info("Starting Get All Data");
        List<Feature> featureList = featureRepository.findAll();
        System.out.println(featureRepository.findAll());

        return featureList;
    }

}