package com.jml.eurekaclient1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: jml
 * @Date: 18-4-15
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClient1Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClient1Application.class, args);
    }
}
