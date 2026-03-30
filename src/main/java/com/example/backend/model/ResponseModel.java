package com.example.backend.model;

public class ResponseModel {

    private String message;

    // ✅ Constructor (THIS IS MISSING)
    public ResponseModel(String message) {
        this.message = message;
    }

    // Getter
    public String getMessage() {
        return message;
    }

    // Setter (optional)
    public void setMessage(String message) {
        this.message = message;
    }
}