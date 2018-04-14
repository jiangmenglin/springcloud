package com.jml.auth.service.impl;

import com.jml.auth.dao.SysUserRepository;
import com.jml.auth.domain.SysUser;
import com.jml.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: jml
 * @Date: 18-4-14
 * @Description:
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private SysUserRepository userRepository;

    @Override
    public SysUser findByUserName(String userName) {
        return null;
    }
}
