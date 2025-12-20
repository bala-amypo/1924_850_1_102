package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.example.demo.entity.Warranty;
import com.example.demo.repository.WarrantyRepository;

@Service
public class WarrantyService {

    private final WarrantyRepository repo;

    public WarrantyService(WarrantyRepository repo) {
        this.repo = repo;
    }

    public Warranty save(Warranty warranty) {
        return repo.save(warranty);
    }

    public List<Warranty> getAll() {
        return repo.findAll();
    }
}
