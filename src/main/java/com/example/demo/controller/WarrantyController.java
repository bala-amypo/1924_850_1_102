package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Warranty;
import com.example.demo.service.WarrantyService;

@RestController
@RequestMapping("/warranties")
public class WarrantyController {

    private final WarrantyService service;

    public WarrantyController(WarrantyService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Warranty save(@RequestBody Warranty warranty) {
        return service.save(warranty);
    }

    @GetMapping
    public List<Warranty> getAll() {
        return service.getAll();
    }
}
