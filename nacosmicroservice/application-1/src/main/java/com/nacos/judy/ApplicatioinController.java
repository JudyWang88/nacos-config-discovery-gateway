package com.nacos.judy;

import com.nacos.serviceapi.ConsumerService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @创建人 wxf
 * @创建时间 2019/12/25
 * @描述
 */
@RestController
public class ApplicatioinController {

    @Reference
    private ConsumerService consumerService;

    @GetMapping("/service")
    public String service(){
        return "test"+  consumerService.service();
    }
}
