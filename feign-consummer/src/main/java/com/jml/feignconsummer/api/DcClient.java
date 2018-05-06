package com.jml.feignconsummer.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: jml
 * @Date: 18-5-6
 * @Description:
 */
@FeignClient("compute-service")
public interface DcClient {

    @RequestMapping(value = "/dc", method = RequestMethod.GET)
    String consumer();
}
