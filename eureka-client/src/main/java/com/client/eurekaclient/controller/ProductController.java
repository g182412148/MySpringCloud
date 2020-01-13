package com.client.eurekaclient.controller;

import com.client.eurekaclient.bean.Book;
import com.client.eurekaclient.bean.Product;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

@RestController
public class ProductController {

    @GetMapping("/product/{id}")
    public Product productInfo(@PathVariable(name = "id") Long productId) {
        Product product = new Product();
        product.setId(productId);
        product.setName("product 1:苹果");
        product.setPrice(12d);
        return product;
    }

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    public String hello1(@RequestParam String name) {
        return "hello " + name + "!";
    }

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public Book hello2(@RequestHeader String name, @RequestHeader String author, @RequestHeader Long price) throws UnsupportedEncodingException {
        Book book = new Book();
        book.setName(URLDecoder.decode(name, "UTF-8"));
        book.setAuthor(URLDecoder.decode(author, "UTF-8"));
        book.setPrice(price);
        System.out.println(book);
        return book;
    }

    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    public String hello3(@RequestBody Book book) {
        return "书名为：" + book.getName() + ";作者为：" + book.getAuthor();
    }
}