package com.security.spring_security.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {
    
    @GetMapping("/admin")
    public ResponseEntity<String> getAdminUser(){
        return ResponseEntity.ok("Yes, I am Admin User");
    }
    @GetMapping("/normal")
    public ResponseEntity<String> getNormalUser(){
        return ResponseEntity.ok("Yes, I am Normal User");
    }
    @GetMapping("/public")
    public ResponseEntity<String> getPublicUser(){
        return ResponseEntity.ok("Yes, I am Public User");
    }
}
