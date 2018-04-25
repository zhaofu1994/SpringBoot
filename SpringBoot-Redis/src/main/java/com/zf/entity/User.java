package com.zf.entity;

import java.io.Serializable;

/**
 * @描述:
 * @作者: zf
 * @创建: 2018/4/25-16:07;
 * @版本: V1.0
 **/
public class User implements Serializable {

    private static final long serialVersionUID = -1L;

    private String username;
    private Integer age;

    public User(String username, Integer age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}