package com.personal.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;

    /**
     *订单服务[服务消费者]，调用会员服务
     * 订单服务，
     * @return
     */
    @RequestMapping("/getorder")
    public String getOrder() {
        String url = "http://app-personal-member/getmember";//会员服务的地址
        String message = restTemplate.getForObject(url, String.class);
        System.out.println("message:" + message);
        return message;
    }
}
