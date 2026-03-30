package com.example.backend.service;

import org.springframework.stereotype.Service;
import com.example.backend.model.ResponseModel;

@Service
public class TestService {

    public ResponseModel getMessage() {
        return new ResponseModel("Hello from Spring Boot");
    }
}