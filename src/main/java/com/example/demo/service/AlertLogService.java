package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.AlertLog;
import com.example.demo.repository.AlertLogRepository;

@Service
public class AlertLogService {

    private final AlertLogRepository repository;

    public AlertLogService(AlertLogRepository repository) {
        this.repository = repository;
    }

    public AlertLog saveAlertLog(AlertLog alertLog) {
        return repository.save(alertLog);
    }

    public List<AlertLog> getAllAlertLogs() {
        return repository.findAll();
    }
}
