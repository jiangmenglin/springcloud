package com.jml.feignconsummer;

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
public class FeignConsummerApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignConsummerApplication.class, args);
    }
}
