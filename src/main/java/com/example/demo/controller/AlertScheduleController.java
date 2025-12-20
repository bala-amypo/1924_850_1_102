package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.AlertSchedule;
import com.example.demo.repository.AlertScheduleRepository;

@RestController
@RequestMapping("/alertschedules")
public class AlertScheduleController {

    private final AlertScheduleRepository repository;

    public AlertScheduleController(AlertScheduleRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AlertSchedule createAlertSchedule(@RequestBody AlertSchedule alertSchedule) {
        return repository.save(alertSchedule);
    }

    @GetMapping
    public List<AlertSchedule> getAllAlertSchedules() {
        return repository.findAll();
    }
}
