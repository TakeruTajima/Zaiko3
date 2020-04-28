package com.example.zaiko.domain.outside.product;

public interface ProductRepository {
    void save(Product product);
    Product findOne(ProductId productId);
}
