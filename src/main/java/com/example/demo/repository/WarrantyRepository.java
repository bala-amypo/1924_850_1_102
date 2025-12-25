package com.example.demo.repository;

import com.example.demo.entity.Warranty;
import java.time.LocalDate;
import java.util.*;

public interface WarrantyRepository {
    Warranty save(Warranty warranty);
    Optional<Warranty> findById(Long id);
    boolean existsBySerialNumber(String serial);
    List<Warranty> findByUserId(Long userId);
    List<Warranty> findWarrantiesExpiringBetween(LocalDate from, LocalDate to);
}
