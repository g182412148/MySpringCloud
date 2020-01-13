package com.provider.eurekaprovider.bean;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
    @Bean
    @LoadBalanced
    public RestTemplate buildRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    public IRule muRule() {
        return new RoundRobinRule();//轮询
        // return new RandomRule();// 随机
    }

}
