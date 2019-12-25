package com.nacos.sevice;

import com.nacos.service2pai.ProviderService;
import com.nacos.serviceapi.ConsumerService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;

/**
 * @创建人 wxf
 * @创建时间 2019/12/25
 * @描述
 */
@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Reference
    private ProviderService providerService;
    public String service() {
        return "Consumer invoke" +" "+providerService.service();
    }
}
