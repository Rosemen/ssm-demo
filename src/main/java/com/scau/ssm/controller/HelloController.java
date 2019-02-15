package com.scau.ssm.controller;

import com.scau.ssm.entity.User;
import com.scau.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * HelloController:测试处理器
 *
 * @author chen
 * @date 2019/02/14
 */
@Controller
public class HelloController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/get/{username}", method = RequestMethod.GET)
    public User get(@PathVariable("username") String username) {
        User user = userService.get(username);
        System.out.println("user:" + user.toString());
        return user;
    }
}
