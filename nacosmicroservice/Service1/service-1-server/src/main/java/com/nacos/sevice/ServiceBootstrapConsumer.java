package com.nacos.sevice;

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
public class ServiceBootstrapConsumer {
    public static void main(String[] args) {
        SpringApplication.run(ServiceBootstrapConsumer.class, args);
    }
}
