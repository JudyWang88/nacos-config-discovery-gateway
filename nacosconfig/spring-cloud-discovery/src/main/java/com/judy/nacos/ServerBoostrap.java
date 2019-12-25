package com.judy.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @创建人 wxf
 * @创建时间 2019/12/25
 * @描述
 */
@SpringBootApplication
@RestController
@EnableDiscoveryClient    // 如果使用的是Feign则是@EnableFeignClients
public class ServerBoostrap {
    public static void main(String[] args) {
        SpringApplication.run(ServerBoostrap.class, args);
    }
//
//    @GetMapping(value = "/service")
//    public String serviceProvider(){
//        return "judy";
//    }

}
