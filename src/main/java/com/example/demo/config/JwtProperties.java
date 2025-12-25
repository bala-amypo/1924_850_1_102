package com.example.demo.config;

import lombok.Data;

@Data
public class JwtProperties {
    private String secret;
    private long expirationMs;
}
