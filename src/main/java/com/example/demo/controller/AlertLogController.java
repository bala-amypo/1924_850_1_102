package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.AlertLog;
import com.example.demo.repository.AlertLogRepository;

@RestController
@RequestMapping("/alertlogs")
public class AlertLogController {

    private final AlertLogRepository repository;

    public AlertLogController(AlertLogRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AlertLog createAlertLog(@RequestBody AlertLog alertLog) {
        return repository.save(alertLog);
    }

    @GetMapping
    public List<AlertLog> getAllAlertLogs() {
        return repository.findAll();
    }
}
