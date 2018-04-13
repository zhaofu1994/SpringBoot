package com.zf.springboot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

/**
 * @描述:
 * @作者: zf
 * @创建: 2018/4/13-17:07;
 * @版本: V1.0
 **/
@Slf4j
public class ApplicationReadyEventListener implements ApplicationListener<ApplicationReadyEvent> {
    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        log.info("......ApplicationReadyEvent......");
    }
}
