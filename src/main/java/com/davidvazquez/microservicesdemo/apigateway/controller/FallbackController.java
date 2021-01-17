package com.davidvazquez.microservicesdemo.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
    @GetMapping("/userServiceFallback")
    public String userServiceFallback() {
        return "The USER-SERVICE is down.  Please try again later.";
    }    

    @GetMapping("/departmentServiceFallback")
    public String departmentServiceFallback() {
        return "The DEPARTMENT-SERVICE is down.  Please try again later.";
    }    
}
