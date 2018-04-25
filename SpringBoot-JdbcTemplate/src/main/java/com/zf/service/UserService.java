package com.zf.service;

/**
 * @描述:
 * @作者: zf
 * @创建: 2018/4/24-11:02;
 * @版本: V1.0
 **/
public interface UserService {
    /**
     * 新增一个用户
     * @param name
     * @param age
     */
    void create(String name, Integer age);

    /**
     * 根据name删除一个用户高
     * @param name
     */
    void deleteByName(String name);

    /**
     * 获取用户总量
     */
    Integer getAllUsers();

    /**
     * 删除所有用户
     */
    void deleteAllUsers();

}
