package com.jml.web.service;

import com.jml.web.domain.User;

import java.util.List;

/**
 * @Author: jml
 * @Date: 18-4-14
 * @Description:
 */
public interface UserService {

    User add(User entity);

    User findById(Long id);

    void deleteById(long id);

    List<User> findAll();
}
