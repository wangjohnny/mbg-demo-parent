package com.github.mybatis.generator.ext.demo.model;

import java.util.Date;

import com.github.mybatis.generator.ext.demo.model.base.BaseUser;

public class User extends BaseUser {
    private static final long serialVersionUID = 1L;

    public int getAge() {
        return (new Date()).getYear() - this.getBirthday().getYear();
    }
}