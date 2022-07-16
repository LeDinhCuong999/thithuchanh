package com.example.thithuchanh.service;

import com.example.thithuchanh.entity.Product;
import com.example.thithuchanh.entity.Sale;
import com.example.thithuchanh.repository.ProductRepository;
import com.example.thithuchanh.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SaleService {

    @Autowired
    private SaleRepository productRepository;

    public Iterable<Sale> findAll(){
        return productRepository.findAll();
    }
}
