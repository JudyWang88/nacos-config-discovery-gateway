package com.judy.nacos;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @创建人 wxf
 * @创建时间 2019/12/25
 * @描述
 */
@FeignClient(name = "provider")
@Service
public interface ProviderClient {
    @GetMapping("/service")
    String service();
}
