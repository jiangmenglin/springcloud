package com.jml.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: jml
 * @Date: 18-4-14
 * @Description:
 */
@SpringBootApplication
public class ConfigClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }
}

@RestController
@RefreshScope
class MessageController {
    @Value("${message:Hello default}")
    private String message;

    @Value("${spring.datasource.url}")
    private String url;

    @RequestMapping(method = RequestMethod.GET, value = "/message")
    public String getMessage() {
        return message;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/dburl")
    public String getDbUrl() {
        return url;
    }
}
