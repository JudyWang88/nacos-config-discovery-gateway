package com.judy.nacos.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @创建人 wxf
 * @创建时间 2019/12/24
 * @描述
 */
@SpringBootApplication
@RestController
public class ServerBoostrap2 {
    public static void main(String[] args) {
        SpringApplication.run(ServerBoostrap2.class,args);
    }

    @Value("${common.name}")
    private String config1;

    @GetMapping(value = "/getConfig2")
    public String getConfig1(){
        return config1;
    }
}
