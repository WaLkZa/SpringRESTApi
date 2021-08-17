package org.quanterall.restapidemo.bootstrap;

import org.quanterall.restapidemo.entities.Product;
import org.quanterall.restapidemo.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProductLoader implements CommandLineRunner {
    public final ProductRepository productRepository;

    public ProductLoader(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        this.loadProducts();
    }

    private void loadProducts() {
        if (productRepository.count() == 0) {
            productRepository.save(
                new Product()
                .setName("Huawei")
                .setDescription("Smartphone for everything")
                .setPrice(2000)
            );
            System.out.println("Sample Products Loaded");
        }
    }
}