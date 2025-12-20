package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Warranty;
import com.example.demo.repository.WarrantyRepository;

@Service
public class WarrantyService {

    private final WarrantyRepository repository;

    public WarrantyService(WarrantyRepository repository) {
        this.repository = repository;
    }

    public Warranty saveWarranty(Warranty warranty) {
        return repository.save(warranty);
    }

    public List<Warranty> getAllWarranties() {
        return repository.findAll();
    }
}
