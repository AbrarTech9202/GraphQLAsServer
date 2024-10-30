package com.graph.service;

import com.graph.entity.Product;
import com.graph.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProduct() {
      return productRepository.findAll();
    }

    @Override
    public List<Product> getProductByCategory(String category) {
       return productRepository.getProductByCategory(category);
    }

    @Override
    public Product updateStock(int id, int stock) {
        Product product = productRepository.findById(id).orElseThrow((() -> new RuntimeException("Product not found" + id)));
         product.setStock(stock);
         return productRepository.save(product);
    }

    @Override
    public Product updateProduct1(int id, int newStock) {
        Product product = productRepository.findById(id).orElseThrow((() -> new RuntimeException("Product not found" + id)));
       if(product==null)
       {
            throw new RuntimeException("product is null...");
       }
       int currentStock = product.getStock();
       product.setStock(currentStock + newStock);
        productRepository.save(product);
        return product;

    }


}
