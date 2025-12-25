package com.example.demo.repository;

import com.example.demo.entity.Product;
import java.util.*;

public interface ProductRepository {
    Product save(Product product);
    List<Product> findAll();
    Optional<Product> findById(Long id);
}
