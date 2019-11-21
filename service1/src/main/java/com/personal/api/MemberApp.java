package com.personal.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**服务
 * 会员服务
 * [服务提供者]
 * 通常先启动服务提供者
 */
@SpringBootApplication
@EnableEurekaClient
public class MemberApp {
    /**
     * 启动服务->会自动注册服务
     * 在单独的虚拟机里启动的
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(MemberApp.class, args);
    }
}
