package com.github.mybatis.generator.ext.demo.service;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.mybatis.generator.ext.demo.model.User;

public class UserServiceTest extends BaseSpringTest {

    @Autowired
    private UserService userService;

    @Test
    public void queryAll() {

        List<User> list = userService.queryAll();

        System.out.println("list=" + list);
    }
}
