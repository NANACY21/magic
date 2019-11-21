package com.personal.api;


import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MemberController {

    /**
     * 对外提供的服务 比如叫会员服务
     *
     * 提供了一个url partten
     * @return
     */
    @RequestMapping("/getmember")
    public String getMember() {
        return "this is a member";
    }
}
