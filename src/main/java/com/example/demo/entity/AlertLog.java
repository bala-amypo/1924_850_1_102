package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AlertLog {
    @Id @GeneratedValue
    private Long id;

    private String message;
    private LocalDateTime sentAt;

    @ManyToOne
    private Warranty warranty;

    @PrePersist
    public void prePersist() {
        sentAt = LocalDateTime.now();
    }
}
