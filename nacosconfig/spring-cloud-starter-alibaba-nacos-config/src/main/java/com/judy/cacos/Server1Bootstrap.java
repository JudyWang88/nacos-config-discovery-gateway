package com.judy.cacos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @创建人 wxf
 * @创建时间 2019/12/24
 * @描述
 */
@SpringBootApplication
@RestController
public class Server1Bootstrap {

    @Autowired
    private ConfigurableApplicationContext applicationContext;

    @GetMapping(value = "/getConfig1Context")
    public String getConfig1Context(){
        return applicationContext.getEnvironment().getProperty("common.name");
    }

    public static void main(String[] args) {
        SpringApplication.run(Server1Bootstrap.class, args);
    }

    @Value("${common.name}")
    private String config1;

    @GetMapping(value = "/getConfig1")
    public String getConfig1(){
        return config1;
    }


}
