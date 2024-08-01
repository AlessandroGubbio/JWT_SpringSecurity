package com.example.SpringSecurityJWT.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/demo")
    public ResponseEntity<String> demo(){
        return ResponseEntity.ok("hello from secret url");
    }

    @GetMapping("/admin_only")
    public ResponseEntity<String> admin(){
        return ResponseEntity.ok("hello from admin_only");
    }
}
