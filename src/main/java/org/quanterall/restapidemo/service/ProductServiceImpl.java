package org.quanterall.restapidemo.service;

import java.util.List;

import org.quanterall.restapidemo.entities.Product;
import org.quanterall.restapidemo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    
    @Autowired
    private ProductRepository repository;

    @Override
    public List<Product> getProducts() {
        return repository.findAll();
    }

    @Override
    public Product getProductById(int productId) {
        return repository.findById(productId).get();
    }

    @Override
    public Product createProduct(Product product) {
        return repository.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        return repository.save(product); 
    }

    @Override
    public void deleteProduct(int productId) {
        repository.deleteById(productId);
    }
}
