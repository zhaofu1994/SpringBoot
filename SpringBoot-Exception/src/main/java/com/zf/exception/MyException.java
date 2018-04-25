package com.zf.exception;

/**
 * @author zf
 * @描述:
 * @创建: 2018/4/24-10:44;
 * @版本: V1.0
 **/
public class MyException extends Exception {
    public MyException() {
        super("系统异常");
    }

    public MyException(String message) {
        super(message);
    }
}
