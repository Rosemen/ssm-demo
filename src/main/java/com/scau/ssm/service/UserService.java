package com.scau.ssm.service;

import com.scau.ssm.entity.User;

/**
 * UserService:用户业务接口
 *
 * @author chen
 * @date 2019/02/15
 */
public interface UserService {
    /**
     * 根据用户名查询用户
     *
     * @param username
     * @return User
     */
    User get(String username);
}
