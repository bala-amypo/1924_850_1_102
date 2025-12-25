package com.example.demo.controller;

import com.example.demo.entity.AlertLog;
import com.example.demo.service.AlertLogService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/logs")
public class AlertLogController {

    private final AlertLogService alertLogService;

    public AlertLogController(AlertLogService alertLogService) {
        this.alertLogService = alertLogService;
    }

    @PostMapping("/{warrantyId}")
    public ResponseEntity<AlertLog> addLog(@PathVariable Long warrantyId,
                                           @RequestBody String message) {
        return ResponseEntity.ok(
                alertLogService.addLog(warrantyId, message)
        );
    }

    @GetMapping("/{warrantyId}")
    public ResponseEntity<List<AlertLog>> getLogs(@PathVariable Long warrantyId) {
        return ResponseEntity.ok(
                alertLogService.getLogs(warrantyId)
        );
    }
}
