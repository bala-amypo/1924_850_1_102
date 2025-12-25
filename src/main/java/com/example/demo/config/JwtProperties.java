package com.example.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component   // ✅ REQUIRED
@ConfigurationProperties(prefix = "jwt")
public class JwtProperties {
    private String secret = "12345678901234567890123456789012";
    private long expirationMs = 3600000;
}
