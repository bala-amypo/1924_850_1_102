package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.LocalDateTime;

@Entity
@Table(name = "alert_logs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AlertLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "warranty_id", nullable = false)
    @JsonIgnore
    private Warranty warranty;

    @Column(nullable = false)
    private String message;

    @Column(nullable = false)
    private LocalDateTime sentAt;

    @PrePersist
    public void onCreate() {
        this.sentAt = LocalDateTime.now();
    }
}
