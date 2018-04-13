package com.zf.springboot;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author : zf
 * @描述:
 * @创建: 2018/4/13-17:57;
 * @版本: V1.0
 **/
@Data
@ConfigurationProperties(prefix = "com.didispace")
public class FooProperties {
    private String foo;
    private String databasePlatform;
}
