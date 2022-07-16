package com.example.thithuchanh.api;

import com.example.thithuchanh.entity.Product;
import com.example.thithuchanh.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/products")
@CrossOrigin(value = "*")
public class ProductApi {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Product> findAll(){
        return ProductRepository.findAll();
    }

    @RequestMapping(path = "{id}", method = RequestMethod.GET)
    public Product findById(@PathVariable String rollNumber) {
        Optional<Product> optionalProduct = ProductRepository.findById(rollNumber);
        if(optionalProduct.isPresent()){
            return optionalProduct.get();
        }
        return null;
    }

    @RequestMapping(method = RequestMethod.POST)
    public Product create(@RequestBody Product Product){
        ProductRepository.save(Product);
        return Product;
    }

    @RequestMapping(path = "{id}", method = RequestMethod.DELETE)
    public boolean deleteById(@PathVariable String rollNumber){
        Optional<Product> optionalProduct = ProductRepository.findById(rollNumber);
        if(optionalProduct.isPresent()){
            Product Product = optionalProduct.get();
            ProductRepository.delete(Product);
        }
        return false;
    }

    @RequestMapping(path = "{id}", method = RequestMethod.PUT)
    public Product updateById(@RequestBody Product updateProduct, @PathVariable String rollNumber){
        Optional<Product> optionalProduct = ProductRepository.findById(rollNumber);
        if(optionalProduct.isPresent()){
            Product existingProduct = optionalProduct.get();
            existingProduct.setProdName(updateProduct.getProdName());
            existingProduct.setDescription(updateProduct.getDescription());
            existingProduct.setDateOfManf(updateProduct.getDateOfManf());
            existingProduct.setPrice(updateProduct.getPrice());
            ProductRepository.save(existingProduct);
        }
        return null;
    }
}
