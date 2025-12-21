package com.example.demo.controller;

import com.example.demo.entity.Warranty;
import com.example.demo.service.WarrantyService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/warranties")
@RequiredArgsConstructor
public class WarrantyController {

    private final WarrantyService warrantyService;

    // REGISTER WARRANTY
    @PostMapping("/register/{userId}/{productId}")
    public Warranty registerWarranty(
            @PathVariable Long userId,
            @PathVariable Long productId,
            @RequestBody Warranty warranty
    ) {
        return warrantyService.registerWarranty(userId, productId, warranty);
    }

    // GET WARRANTY BY ID
    @GetMapping("/{warrantyId}")
    public Warranty getWarranty(@PathVariable Long warrantyId) {
        return warrantyService.getWarranty(warrantyId);
    }

    // GET WARRANTIES FOR USER
    @GetMapping("/user/{userId}")
    public List<Warranty> getUserWarranties(@PathVariable Long userId) {
        return warrantyService.getUserWarranties(userId);
    }
}
