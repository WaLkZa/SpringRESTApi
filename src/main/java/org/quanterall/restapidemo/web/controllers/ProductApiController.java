package org.quanterall.restapidemo.web.controllers;

import java.util.List;

import org.quanterall.restapidemo.entities.Product;
import org.quanterall.restapidemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductApiController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getProducts();
    }

    @GetMapping({"/{id}"})
    public Product getProductById(@PathVariable("id") int id) {
        return productService.getProductById(id);
    }

    @PostMapping({"/"})
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @PutMapping({"/"})
    public Product updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }

    @DeleteMapping({"/{id}"})
    public void  deleteProduct(@PathVariable("id") int id) {
        productService.deleteProduct(id);
    }
}