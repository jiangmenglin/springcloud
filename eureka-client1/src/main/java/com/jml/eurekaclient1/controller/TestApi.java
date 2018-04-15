package com.jml.eurekaclient1.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @Author: jml
 * @Date: 18-4-15
 * @Description:
 */
public interface TestApi {
    @RequestMapping(value = "/testhello/{name}", method = RequestMethod.GET)
    String testHello(@PathVariable("name") String name);
}
