package com.zf.service.impl;

import com.zf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * @author : zf
 * @描述:
 * @创建: 2018/4/24-11:03;
 * @版本: V1.0
 **/
@Service
public class UserserviceImpl implements UserService {
    @Override
    public void create(String name, Integer age) {

    }

    @Override
    public void deleteByName(String name) {

    }

    @Override
    public Integer getAllUsers() {
        return null;
    }

    @Override
    public void deleteAllUsers() {

    }
//    @Autowired
//    private JdbcTemplate jdbcTemplate;

//    @Override
//    public void create(String name, Integer age) {
//        jdbcTemplate.update("insert into USER(NAME, AGE) values(?, ?)", name, age);
//    }
//
//    @Override
//    public void deleteByName(String name) {
//        jdbcTemplate.update("delete from USER where NAME = ?", name);
//    }
//
//    @Override
//    public Integer getAllUsers() {
//        return jdbcTemplate.queryForObject("select count(1) from USER", Integer.class);
//    }
//
//    @Override
//    public void deleteAllUsers() {
//        jdbcTemplate.update("delete from USER");
//    }
}
