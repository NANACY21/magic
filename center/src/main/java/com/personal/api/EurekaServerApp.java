package com.personal.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * 服务注册中心
 * 微服务架构，服务注册中心的搭建，服务的注册，高可用方式
 * 分布式、请求分发及反向代理服务器
 * <p>
 * <p>
 * 改动：maven settings.xml不用阿里镜像，导致都得重新导入，
 * 用阿里镜像->新建module->不用阿里镜像
 * <p>
 * 所有都不报错就行！！！
 * <p>
 * <p>
 * 同一项目中的模块要使用相同maven镜像，，
 * ！！！只有本项目的模块用默认镜像！！！
 */
@SpringBootApplication
//@SpringBootConfiguration
@EnableEurekaServer
public class EurekaServerApp {


    /**
     * 启动服务注册中心
     * <p>
     * service1等项目都可以注册到该注册中心上
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApp.class);
    }
}
