package com.provider.eurekaprovider.controller;

import com.provider.eurekaprovider.bean.Product;
import com.provider.eurekaprovider.service.ProductClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ProductController {

    //    @Autowired
//    private RestTemplate restTemplate;
//
//    @RequestMapping("/product/{id}")
//    public String productInfo(@PathVariable(name = "id") Long productId) {
//
//        String url = "http://PRODUCTSERVER/product/" + productId;
//        ResponseEntity<String> forEntity = restTemplate.getForEntity(url, String.class);
//        String message = forEntity.getBody();
//
//        return message;
//    }
//    @Autowired
//    private LoadBalancerClient loadBalancerClient;
//    @Autowired
//    private RestTemplate restTemplate;
//
//    @RequestMapping("/product/{id}")
//    public String productInfo(@PathVariable(name="id")Long productId) {
//
//        ServiceInstance serviceInstance = loadBalancerClient.choose("PRODUCTSERVER");
//        URI uri = serviceInstance.getUri();
//        String url = uri.toString()+ "/product/"+ productId;
//        ResponseEntity<String> forEntity = restTemplate.getForEntity(url, String.class);
//        String message = forEntity.getBody();
//
//        return message;
//    }
    @Resource
    private ProductClient personClient;

    @RequestMapping(value = "/index/{id} {name}")
    public Product productInfo(@PathVariable("id") String productId, @PathVariable("name") String productName) {
        Product product = personClient.productInfo(1L);
        return product;
    }
}