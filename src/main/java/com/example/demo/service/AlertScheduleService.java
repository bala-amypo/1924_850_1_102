package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.AlertSchedule;
import com.example.demo.repository.AlertScheduleRepository;

@Service
public class AlertScheduleService {

    private final AlertScheduleRepository repository;

    public AlertScheduleService(AlertScheduleRepository repository) {
        this.repository = repository;
    }

    public AlertSchedule saveAlertSchedule(AlertSchedule alertSchedule) {
        return repository.save(alertSchedule);
    }

    public List<AlertSchedule> getAllAlertSchedules() {
        return repository.findAll();
    }
}
