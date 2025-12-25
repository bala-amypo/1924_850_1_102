package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Warranty {
    @Id @GeneratedValue
    private Long id;

    private LocalDate purchaseDate;
    private LocalDate expiryDate;
    private String serialNumber;

    @ManyToOne
    private User user;

    @ManyToOne
    private Product product;
}
