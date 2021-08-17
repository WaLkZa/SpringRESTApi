package org.quanterall.restapidemo.service;

import java.util.List;

import org.quanterall.restapidemo.entities.Product;

public interface ProductService {
    
    List<Product> getProducts();

    Product getProductById(int productId);

    Product createProduct(Product product);

    Product updateProduct(Product product);

    void deleteProduct(int productId);
}
