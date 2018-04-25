package com.zf.entity;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author : zf
 * @描述:
 * @创建: 2018/4/25-16:40;
 * @版本: V1.0
 **/
public interface UserRepository extends MongoRepository<User, Long> {
    /**
     * findByUsername
     * @param username
     * @return
     */
    User findByUsername(String username);
}
