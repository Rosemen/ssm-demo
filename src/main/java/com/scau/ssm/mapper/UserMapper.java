package com.scau.ssm.mapper;

import com.scau.ssm.entity.User;

/**
 * UserMapper:数据库操作Mapper接口
 *
 * @author chen
 * @date 2019/02/15
 */
public interface UserMapper {
    /**
     * 根据用户名从数据库查询出用户
     *
     * @param username
     * @return User
     */
    User get(String username);
}
