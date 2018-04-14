package com.jml.auth.service;

import com.jml.auth.domain.SysUser;
import org.bouncycastle.crypto.RuntimeCryptoException;
import org.hibernate.mapping.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: jml
 * @Date: 18-4-14
 * @Description:
 */
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;  //数据库中user的service

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        SysUser user = userService.findByUserName(userName);
        if (user == null) {
            throw new RuntimeCryptoException(userName + " is not find.");
        }
        return user;
    }
}
