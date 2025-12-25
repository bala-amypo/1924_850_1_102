package com.example.digitalwarrantytracker.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.util.Date;

@Component
public class ModelValidator {

    // ✅ SECURE KEY FOR HS512 (FIXED)
    private final SecretKey secretKey =
            Keys.secretKeyFor(SignatureAlgorithm.HS512);

    public String generateToken(String username) {

        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(
                        new Date(System.currentTimeMillis() + 86400000)
                )
                .signWith(secretKey, SignatureAlgorithm.HS512)
                .compact();
    }
}
