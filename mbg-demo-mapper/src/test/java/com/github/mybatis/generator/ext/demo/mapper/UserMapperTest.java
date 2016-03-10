package com.github.mybatis.generator.ext.demo.mapper;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.mybatis.generator.ext.demo.model.User;
import com.github.mybatis.generator.ext.demo.model.UserExample;
import com.github.mybatis.pagination.Pagination;

public class UserMapperTest extends BaseSpringTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void countByExample() {

        int size = userMapper.countByExample(null);

        System.out.println("size=" + size);
    }

    @Test
    public void selectByExample() {

        UserExample ex = new UserExample();
        Pagination<User> p = new Pagination<User>(0, 5);
        ex.setPagination(p);
        List<User> list = userMapper.selectByExample(ex);

        for (User user : list) {
            System.out.println("姓名=" + user.getName() + ", 生日=" + user.getBirthday().toLocaleString() + ", 年龄=" + user.getAge());
        }
    }
}
