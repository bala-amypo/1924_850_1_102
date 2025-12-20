package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class AlertSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String scheduleDate;
}
