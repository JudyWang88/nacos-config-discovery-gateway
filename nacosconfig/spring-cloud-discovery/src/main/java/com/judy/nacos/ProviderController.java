package com.judy.nacos;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @创建人 wxf
 * @创建时间 2019/12/25
 * @描述
 */
@RestController
public class ProviderController {
    private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(ProviderController.class);
    @GetMapping("/service")
    public String service(){
        LOG.info("provider invoke");
        return "provider";
    }
}
