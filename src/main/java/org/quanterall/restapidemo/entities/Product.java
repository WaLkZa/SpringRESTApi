package org.quanterall.restapidemo.entities;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "name", nullable = false)
    private String name;
    
    @Column(name = "description", columnDefinition = "TEXT", nullable = false)
    private String description;
    
    @Column(name = "price", nullable = false)
    private int price;
    
    public int getId() {
        return id;
    }
    
    public Product setId(int id) {
        this.id = id;
        return this;
    }
    
    public String getName() {
        return name;
    }
    
    public Product setName(String name) {
        this.name = name;
        return this;
    }
    
    public String getDescription() {
        return description;
    }
    
    public Product setDescription(String description) {
        this.description = description;
        return this;
    }
    
    public int getPrice() {
        return price;
    }
    
    public Product setPrice(int price) {
        this.price = price;
        return this;
    }
}