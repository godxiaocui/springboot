package com.czh.springboot.springboot_08_ssmp.controller.utils;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 异常处理器，需要注解
 */

@RestControllerAdvice
public class ProjectExceptionAdvice {
    //拦截所有异常信息
    @ExceptionHandler
    public R doException(Exception exception){
        //记录日志
        //通知运维
        //通知开发
        return new R("服务器故障稍后再试");
    }
}
