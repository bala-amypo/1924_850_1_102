package com.example.demo.repository;

import com.example.demo.entity.AlertLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WarrantyRepository extends JpaRepository<Warranty, Long> {

    boolean existsBySerialNumber(String serialNumber);

    List<Warranty> findByUserId(Long userId);

    @Query("""
        select w from Warranty w
        where w.expiryDate between :from and :to
    """)
    List<Warranty> findWarrantiesExpiringBetween(LocalDate from, LocalDate to);
}

