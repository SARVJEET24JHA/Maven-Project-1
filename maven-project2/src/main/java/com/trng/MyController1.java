package com.trng;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class MyController1 {
    @GetMapping
    public ResponseEntity<String>getResponse(){
        return ResponseEntity.ok("hello RestyFul API");
    }
}
