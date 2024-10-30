package com.graph.resource;

import com.graph.entity.Product;
import com.graph.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private IProductService productService;

    @QueryMapping
    public List<Product> getAllProduct()
    {
        return productService.getAllProduct();
    }

    @QueryMapping
    public List<Product> getProductByCategory(@Argument String category)
    {
        return productService.getProductByCategory(category);
    }

    @MutationMapping
    public Product updateStock(@Argument int id, @Argument int stock)
    {
        return productService.updateStock(id, stock);
    }

    @MutationMapping
    public Product updateProduct1(int id, int newStock)
    {
        return productService.updateProduct1(id, newStock);
    }


}