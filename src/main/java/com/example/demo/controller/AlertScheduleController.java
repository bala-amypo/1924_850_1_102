package com.example.demo.controller;

import com.example.demo.entity.AlertSchedule;
import com.example.demo.service.AlertScheduleService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schedules")
@RequiredArgsConstructor
public class AlertScheduleController {

    private final AlertScheduleService alertScheduleService;

    // CREATE SCHEDULE
    @PostMapping("/{warrantyId}")
    public AlertSchedule createSchedule(
            @PathVariable Long warrantyId,
            @RequestBody AlertSchedule schedule
    ) {
        return alertScheduleService.createSchedule(warrantyId, schedule);
    }

    // GET SCHEDULES FOR WARRANTY
    @GetMapping("/{warrantyId}")
    public List<AlertSchedule> getSchedules(@PathVariable Long warrantyId) {
        return alertScheduleService.getSchedules(warrantyId);
    }
}
