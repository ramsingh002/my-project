package com.my.project.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/test")
public class MyController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyController.class);

    @GetMapping
    public ResponseEntity<String> apptest(){

        LOGGER.info("CONTROLLER : MyController : apptest...!!!");

        return ResponseEntity.ok("App is Running....!!!!");
    }
}
