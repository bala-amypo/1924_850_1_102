package com.example.demo.config;

import org.springframework.stereotype.Component;

@Component
public class JwtProperties {
    public static final String SECRET = "secretkey";
    public static final long EXPIRATION = 86400000;
}
