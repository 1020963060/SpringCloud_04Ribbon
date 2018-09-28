package com.qq.springcloud_04ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient//发现服务
@EnableEurekaClient//客户端
public class Springcloud04ribbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springcloud04ribbonApplication.class, args);
    }
}
