package com.example.demo.entity;

import jakarta.validation.constraints.Email;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    @Email(message = "Please provide a valid email address")
    private String email;
    private String password;
    private String role;
}