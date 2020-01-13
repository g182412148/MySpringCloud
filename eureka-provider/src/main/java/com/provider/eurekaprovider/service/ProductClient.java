package com.provider.eurekaprovider.service;

import com.provider.eurekaprovider.bean.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "HELLO-SERVER")
public interface ProductClient {
    @GetMapping("/product/{id}")
    public Product productInfo(@PathVariable(name = "id") Long c);
}
