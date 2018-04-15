package com.jml.eurekaclient1.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: jml
 * @Date: 18-4-15
 * @Description:
 */
@RestController
public class TestController implements TestApi {

    @Override
    public String testHello(@PathVariable("name") String name) {
        return "Hello " + name;
    }
}
