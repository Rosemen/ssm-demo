package com.scau.ssm.service.impl;

import com.scau.ssm.entity.User;
import com.scau.ssm.mapper.UserMapper;
import com.scau.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * UserServiceImpl:用户业务接口实现类
 *
 * @author chen
 * @date 2019/02/15
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public User get(String username) {
        return userMapper.get(username);
    }
}
