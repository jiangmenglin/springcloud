package com.jml.feignconsummer.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: jml
 * @Date: 18-4-15
 * @Description:
 */
@FeignClient("test")
public interface TestApi {
    @RequestMapping(value = "/testHello", method = RequestMethod.GET)
    String testHello(String name);
}
