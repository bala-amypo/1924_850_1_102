package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Warranty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer warrantyPeriod;

    @ManyToOne
    private Product product;

    public Long getId() { return id; }
    public Integer getWarrantyPeriod() { return warrantyPeriod; }
    public void setWarrantyPeriod(Integer warrantyPeriod) { this.warrantyPeriod = warrantyPeriod; }
    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }
}
