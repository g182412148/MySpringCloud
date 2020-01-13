package com.provider.eurekaprovider.controller;

import com.provider.eurekaprovider.service.HelloService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

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
    @Autowired
    private HelloService1 helloService;
    @Autowired
    private RestTemplate restTemplate;

//    @RequestMapping(value = "/hello1")
//    public String productInfo() {
//        String a =helloService.hello();
//       return a;
//    }
//    @RequestMapping("/test3")
//    public String test3() throws ExecutionException, InterruptedException, TimeoutException {
//        BookCommand bookCommand = new BookCommand(com.netflix.hystrix.HystrixCommand.Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("")), restTemplate);
////        String a=bookCommand.execute();
//        Future<String> queue = bookCommand.queue();
//        String b= queue.get();
//        return b;
//    }
}