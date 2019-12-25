package com.judy.nacos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @创建人 wxf
 * @创建时间 2019/12/25
 * @描述
 */
@RestController
public class ConsumerController {
    private static final Logger LOG = LoggerFactory.getLogger(ConsumerController.class);
    @Autowired
    private ProviderClient providerClient;

    @GetMapping("/service")
    public String service(){
        LOG.info("consumer invoke");
        String providerResult = providerClient.service();
        return "consumer invoke" + "|" + providerResult;
    }
}
