package com.zf.springboot;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @描述:
 * @author: zf
 * @创建: 2018/4/13-17:56;
 * @版本: V1.0
 **/
@Data
@ConfigurationProperties
public class PostInfo {
    private String title;
    private String content;
}
