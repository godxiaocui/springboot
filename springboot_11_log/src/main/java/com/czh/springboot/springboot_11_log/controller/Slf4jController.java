package com.czh.springboot.springboot_11_log.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
@RequestMapping("/books/sl4j")
public class Slf4jController {




    // 创建日志服务的对象
    // private static final Logger log=LoggerFactory.getLogger(BookController.class);
    @GetMapping
    public String getTitle() {
        log.debug("getTitle");
        log.info("info: getTitle");
        log.warn("warn: getTitle");
        log.error("error: getTitle");
        System.out.println("springboot is starting...");
        return "Spring Boot";
    }
}