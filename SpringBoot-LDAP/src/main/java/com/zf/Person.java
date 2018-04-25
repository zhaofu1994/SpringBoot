package com.zf;

import lombok.Data;
import org.springframework.ldap.odm.annotations.*;

import javax.naming.Name;

/**
 * @author : zf
 * @描述:
 * @创建: 2018/4/24-13:37;
 * @版本: V1.0
 **/
@Entry(base = "ou=people,dc=zf,dc=com", objectClasses = "inetOrgPerson")
@Data
public class Person {
    @Id
    private Name id;
    @DnAttribute(value = "uid", index = 3)
    private String uid;
    @Attribute(name = "cn")
    private String commonName;
    @Attribute(name = "sn")
    private String suerName;
    private String userPassword;
}
