package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AlertSchedule {

    @Id
    @GeneratedValue
    private Long id;

    private Integer daysBeforeExpiry;
    private boolean enabled;

    @ManyToOne
    private Warranty warranty;
}
