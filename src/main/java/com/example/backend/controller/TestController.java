package com.example.backend.controller;

import org.springframework.web.bind.annotation.*;
import com.example.backend.service.TestService;
import com.example.backend.model.ResponseModel;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class TestController {

    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/test")
    public ResponseModel test() {
        return testService.getMessage();
    }
}