package com.jml.web.controller;

import com.jml.web.domain.User;
import com.jml.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: jml
 * @Date: 18-4-14
 * @Description:
 */
@RestController
@Transactional
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public User add(User user) {
        userService.add(user);
        return user;
    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public User delete(Long id) {
        User u = userService.findById(id);
        return u;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<User> list() {
        return userService.findAll();
    }
}
