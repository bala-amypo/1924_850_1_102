package com.example.demo.controller;

import com.example.demo.entity.Warranty;
import com.example.demo.service.WarrantyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/warranties")
public class WarrantyController {

    private final WarrantyService warrantyService;

    public WarrantyController(WarrantyService warrantyService) {
        this.warrantyService = warrantyService;
    }

    @PostMapping("/register/{userId}/{productId}")
    public ResponseEntity<Warranty> registerWarranty(@PathVariable Long userId,
                                                     @PathVariable Long productId,
                                                     @RequestBody Warranty warranty) {
        return ResponseEntity.ok(
                warrantyService.registerWarranty(userId, productId, warranty)
        );
    }

    @GetMapping("/{warrantyId}")
    public ResponseEntity<Warranty> getWarranty(@PathVariable Long warrantyId) {
        return ResponseEntity.ok(warrantyService.getWarranty(warrantyId));
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Warranty>> getUserWarranties(@PathVariable Long userId) {
        return ResponseEntity.ok(warrantyService.getUserWarranties(userId));
    }
}
