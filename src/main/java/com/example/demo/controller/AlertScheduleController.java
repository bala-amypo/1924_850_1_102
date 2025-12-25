package com.example.demo.controller;

import com.example.demo.entity.AlertSchedule;
import com.example.demo.service.AlertScheduleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schedules")
public class AlertScheduleController {

    private final AlertScheduleService alertScheduleService;

    public AlertScheduleController(AlertScheduleService alertScheduleService) {
        this.alertScheduleService = alertScheduleService;
    }

    @PostMapping("/{warrantyId}")
    public ResponseEntity<AlertSchedule> createSchedule(@PathVariable Long warrantyId,
                                                        @RequestBody AlertSchedule schedule) {
        return ResponseEntity.ok(
                alertScheduleService.createSchedule(warrantyId, schedule)
        );
    }

    @GetMapping("/{warrantyId}")
    public ResponseEntity<List<AlertSchedule>> getSchedules(@PathVariable Long warrantyId) {
        return ResponseEntity.ok(
                alertScheduleService.getSchedules(warrantyId)
        );
    }
}
