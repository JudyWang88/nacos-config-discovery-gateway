package com.nacos.judy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @创建人 wxf
 * @创建时间 2019/12/25
 * @描述
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootApplication1 {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication1.class, args);
    }
}
