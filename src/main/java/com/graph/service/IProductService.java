package com.graph.service;

import com.graph.entity.Product;

import java.util.List;

public interface IProductService {

    public List<Product> getAllProduct();
    public List<Product> getProductByCategory(String category);
    public Product updateStock(int id, int stock);
    public Product updateProduct1(int id, int newStock);
}
