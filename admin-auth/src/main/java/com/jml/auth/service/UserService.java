package com.jml.auth.service;


import com.jml.auth.domain.SysUser;

/**
 * @Author: jml
 * @Date: 18-4-14
 * @Description:
 */
public interface UserService {
    SysUser findByUserName(String userName);
}
