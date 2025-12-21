package com.example.demo.service.impl;

import com.example.demo.entity.AlertSchedule;
import com.example.demo.entity.Warranty;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.AlertScheduleRepository;
import com.example.demo.repository.WarrantyRepository;
import com.example.demo.service.AlertScheduleService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlertScheduleServiceImpl implements AlertScheduleService {

    private final AlertScheduleRepository alertScheduleRepository;
    private final WarrantyRepository warrantyRepository;

    @Override
    public AlertSchedule createSchedule(Long warrantyId, AlertSchedule schedule) {

        Warranty warranty = warrantyRepository.findById(warrantyId)
                .orElseThrow(() -> new ResourceNotFoundException("Warranty not found"));

        // Validate daysBeforeExpiry
        if (schedule.getDaysBeforeExpiry() == null || schedule.getDaysBeforeExpiry() < 0) {
            throw new IllegalArgumentException("daysBeforeExpiry must be >= 0");
        }

        schedule.setWarranty(warranty);
        return alertScheduleRepository.save(schedule);
    }

    @Override
    public List<AlertSchedule> getSchedules(Long warrantyId) {

        if (!warrantyRepository.existsById(warrantyId)) {
            throw new ResourceNotFoundException("Warranty not found");
        }

        return alertScheduleRepository.findByWarrantyId(warrantyId);
    }
}
