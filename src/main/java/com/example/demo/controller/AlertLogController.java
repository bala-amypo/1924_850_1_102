package com.example.demo.controller;

import com.example.demo.entity.AlertLog;
import com.example.demo.service.AlertLogService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/logs")
@RequiredArgsConstructor
public class AlertLogController {

    private final AlertLogService alertLogService;

    // CREATE LOG ENTRY
    @PostMapping("/{warrantyId}")
    public AlertLog addLog(
            @PathVariable Long warrantyId,
            @RequestBody String message
    ) {
        return alertLogService.addLog(warrantyId, message);
    }

    // GET LOGS FOR WARRANTY
    @GetMapping("/{warrantyId}")
    public List<AlertLog> getLogs(@PathVariable Long warrantyId) {
        return alertLogService.getLogs(warrantyId);
    }
}
