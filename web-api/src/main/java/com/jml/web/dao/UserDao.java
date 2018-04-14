package com.jml.web.dao;

import com.jml.web.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @Author: jml
 * @Date: 18-4-14
 * @Description:
 */
public interface UserDao extends CrudRepository<User, Long> {
}
