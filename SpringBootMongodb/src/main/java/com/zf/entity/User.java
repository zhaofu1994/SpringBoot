package com.zf.entity;

import org.springframework.data.annotation.Id;

/**
 * @author : zf
 * @描述:
 * @创建: 2018/4/25-16:39;
 * @版本: V1.0
 **/
public class User {
    @Id
    private Long id;

    private String username;
    private Integer age;

    public User(Long id, String username, Integer age) {
        this.id = id;
        this.username = username;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
