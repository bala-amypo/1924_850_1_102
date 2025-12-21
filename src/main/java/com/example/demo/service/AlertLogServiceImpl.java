package com.example.demo.service.impl;

import com.example.demo.entity.AlertLog;
import com.example.demo.entity.Warranty;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.AlertLogRepository;
import com.example.demo.repository.WarrantyRepository;
import com.example.demo.service.AlertLogService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlertLogServiceImpl implements AlertLogService {

    private final AlertLogRepository alertLogRepository;
    private final WarrantyRepository warrantyRepository;

    @Override
    public AlertLog addLog(Long warrantyId, String message) {

        Warranty warranty = warrantyRepository.findById(warrantyId)
                .orElseThrow(() -> new ResourceNotFoundException("Warranty not found"));

        AlertLog log = AlertLog.builder()
                .warranty(warranty)
                .message(message)
                .build();

        return alertLogRepository.save(log);
    }

    @Override
    public List<AlertLog> getLogs(Long warrantyId) {

        if (!warrantyRepository.existsById(warrantyId)) {
            throw new ResourceNotFoundException("Warranty not found");
        }

        return alertLogRepository.findByWarrantyId(warrantyId);
    }
}
