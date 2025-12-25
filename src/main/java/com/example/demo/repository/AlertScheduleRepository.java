package com.example.demo.repository;

import com.example.demo.entity.AlertSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlertScheduleRepository {
    AlertSchedule save(AlertSchedule s);
    List<AlertSchedule> findByWarrantyId(Long warrantyId);
}

