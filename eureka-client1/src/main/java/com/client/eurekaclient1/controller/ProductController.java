package com.client.eurekaclient1.controller;

import com.client.eurekaclient1.bean.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/product/{id}")
    public Product productInfo(@PathVariable(name = "id") Long productId) {
        Product product = new Product();
        product.setId(productId);
        product.setName("product 2:苹果");
        product.setPrice(12d);
        return product;
    }
}