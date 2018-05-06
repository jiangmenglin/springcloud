package com.jml.feignconsummer.controller;

import com.jml.feignconsummer.api.DcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: jml
 * @Date: 18-5-6
 * @Description:
 */
@RestController
public class DcController {
    @Autowired
    DcClient dcClient;

    @RequestMapping(value = "/consumer", method = RequestMethod.GET)
    public String dc() {
        return dcClient.consumer();
    }
}
