package com.example.fullstackbackend.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@CrossOrigin(origins = "*") 
public class TestController {

    Logger logger = LoggerFactory.getLogger(FeatureController.class);

    @GetMapping("/test")
    public String test() {
        logger.info("Success Test Connection!");
        return "☆Success!";
    }
    
    
}
