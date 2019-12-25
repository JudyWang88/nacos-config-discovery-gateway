package com.nacos.server2;

import com.nacos.service2pai.ProviderService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @创建人 wxf
 * @创建时间 2019/12/25
 * @描述
 */
@Service
public class ProviderServiceImpl implements ProviderService {
    public String service() {
        return "Provider invoke";
    }
}
