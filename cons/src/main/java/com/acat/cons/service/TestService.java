package com.acat.cons.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="springcloud-server")
public interface TestService {

    @RequestMapping("/test")
    public String test();
}
