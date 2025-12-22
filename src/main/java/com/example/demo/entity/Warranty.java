package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnore;


import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "warranties")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Warranty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    @JsonIgnore
    private User user;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Column(nullable = false)
    private LocalDate purchaseDate;

    @Column(nullable = false)
    private LocalDate expiryDate;

    @Column(nullable = false, unique = true)
    private String serialNumber;

    @OneToMany(mappedBy = "warranty", cascade = CascadeType.ALL)
    private List<AlertSchedule> alertSchedules;

    @OneToMany(mappedBy = "warranty", cascade = CascadeType.ALL)
    private List<AlertLog> alertLogs;
}
