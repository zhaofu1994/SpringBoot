package com.zf.entity;

/**
 * @author : zf
 * @描述:
 * @创建: 2018/4/19-15:56;
 * @版本: V1.0
 **/
public class User {

    private Long id;

    private String name;

    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
