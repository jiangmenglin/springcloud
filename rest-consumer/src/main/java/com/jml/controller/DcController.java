package com.jml.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: jml
 * @Date: 18-5-6
 * @Description:
 */
@RestController
public class DcController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/consumer", method = RequestMethod.GET)
    public String dc() {
        return restTemplate.getForObject("http://compute-service/dc", String.class);
    }
}
