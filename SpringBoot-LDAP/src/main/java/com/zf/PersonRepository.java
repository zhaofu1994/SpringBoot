package com.zf;

import org.springframework.data.repository.CrudRepository;

import javax.naming.Name;

/**
 * @描述:
 * @作者: zf
 * @创建: 2018/4/24-13:38;
 * @版本: V1.0
 **/
public interface PersonRepository extends CrudRepository<Person, Name> {
}
