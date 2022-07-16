package com.example.thithuchanh.api;

import com.example.thithuchanh.entity.Sale;
import com.example.thithuchanh.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(value = "*")
@RestController
@RequestMapping(path = "api/v1/sales")
public class SaleApi {
    @Autowired
    SaleService saleService;
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Iterable<Sale>> getList(){
        return ResponseEntity.ok(saleService.findAll());
    }
}
