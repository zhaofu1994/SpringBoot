package com.zf.springboot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

/**
 * @描述:
 * @作者: zf
 * @创建: 2018/4/13-17:08;
 * @版本: V1.0
 **/
@Slf4j
public class ApplicationStartingEventListener  implements ApplicationListener<ApplicationStartingEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartingEvent event) {
        log.info("......ApplicationStartingEvent......");
    }
}
