package com.jml.web.service.impl;

import com.jml.web.dao.UserDao;
import com.jml.web.domain.User;
import com.jml.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: jml
 * @Date: 18-4-14
 * @Description:
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User add(User entity) {
        return userDao.save(entity);
    }

    @Override
    public User findById(Long id) {
        return userDao.findOne(id);
    }

    @Override
    public void deleteById(long id) {
        userDao.findOne(id);
    }

    @Override
    public List<User> findAll() {
        Iterable<User> result = userDao.findAll();
        List<User> list = new ArrayList<>();
        if (result != null) {
            for (User u : result) {
                list.add(u);
            }
            return list;
        }
        return null;
    }
}
