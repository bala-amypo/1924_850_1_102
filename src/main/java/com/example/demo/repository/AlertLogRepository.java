package com.example.demo.repository;

import com.example.demo.entity.AlertLog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlertLogRepository {
    AlertLog save(AlertLog log);
    List<AlertLog> findByWarrantyId(Long warrantyId);
}
