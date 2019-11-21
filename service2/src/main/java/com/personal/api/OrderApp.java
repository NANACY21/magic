package com.personal.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**服务
 * 订单服务
 * [服务消费者]
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderApp {
    /**
     * 启动服务
     * 在单独的虚拟机里启动的
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(OrderApp.class, args);
    }

    //注入RestTemplate
    @Bean
    @LoadBalanced
//负载均衡
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
