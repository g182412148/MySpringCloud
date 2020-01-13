package com.provider.eurekaprovider.service;

import com.netflix.hystrix.HystrixCommand;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


public class BookCommand extends HystrixCommand<String> {
    private RestTemplate restTemplate;

    public BookCommand(Setter setter, RestTemplate restTemplate) {
        super(setter);
        this.restTemplate = restTemplate;
    }

    @Override
    protected String getFallback() {
        return "dfsdfsdfsdfsdfdsfd";
    }

    @Override
    protected String run() throws Exception {
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://HELLO-SERVER/product/1", String.class);
        return responseEntity.getBody();
    }
}
