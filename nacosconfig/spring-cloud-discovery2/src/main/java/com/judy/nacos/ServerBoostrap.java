package com.judy.nacos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;

/**
 * @创建人 wxf
 * @创建时间 2019/12/25
 * @描述
 */
@SpringBootApplication
@RestController
@EnableFeignClients
public class ServerBoostrap {
    public static void main(String[] args) {
        SpringApplication.run(ServerBoostrap.class, args);
    }
//
//    @Value(value = "${provider.address}")
//    private String providerAddress;
//
//    @GetMapping(value = "/service")
//    public String service(){
//        RestTemplate restTemplate = new RestTemplate();
//        restTemplate.getForObject("http://" + providerAddress + "/service", String.class);
//        return "consumer invoke |"+providerAddress;
//    }

}
