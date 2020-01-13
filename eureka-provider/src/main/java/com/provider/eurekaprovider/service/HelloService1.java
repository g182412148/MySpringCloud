package com.provider.eurekaprovider.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.command.AsyncResult;
import com.provider.eurekaprovider.bean.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.awt.print.Book;
import java.util.concurrent.Future;

@Service
public class HelloService1 {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "error")
    public String hello() {
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://HELLO-SERVER/product/1", String.class);
        return responseEntity.getBody();
    }

    public String error() {
        return new Product(1l, "错误", 2d).toString();
    }

    @HystrixCommand
    public Future<Book> test3() {
        return new AsyncResult<Book>() {
            @Override
            public Book invoke() {
                return restTemplate.getForObject("http://HELLO-SERVICE/getbook1", Book.class);
            }
        };
    }
}
