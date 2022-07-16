package com.example.thithuchanh.api;

import com.example.thithuchanh.entity.Product;
import com.example.thithuchanh.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(value = "*")
@RestController
@RequestMapping(path = "api/v1/products")
public class ProductApi {
    @Autowired
    ProductService productService;
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Iterable<Product>> getList(){
        return ResponseEntity.ok(productService.findAll());
    }
}
