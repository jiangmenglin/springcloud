package com.jml.auth.dao;

import com.jml.auth.domain.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: jml
 * @Date: 18-4-14
 * @Description:
 */
@Repository
public interface SysUserRepository extends JpaRepository<SysUser, Long> {

    SysUser findByUserName(String userName);
}
