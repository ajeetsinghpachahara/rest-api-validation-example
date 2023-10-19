package com.ajeet.testrestapi.controller;

import com.ajeet.testrestapi.dto.EmpData;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String getHello(@RequestParam String name){
        return "Hello "+name;
    }

    @PostMapping("/testValidation")
    public ResponseEntity<String> testValidation(@Valid @RequestBody EmpData empData){
        return new ResponseEntity<>("validation success", HttpStatus.OK);
    }
}
