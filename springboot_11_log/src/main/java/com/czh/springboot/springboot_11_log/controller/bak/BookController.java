package com.czh.springboot.springboot_11_log.controller.bak;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController extends BaseController {
    // 创建日志服务的对象
  // private static final Logger log=LoggerFactory.getLogger(BookController.class);
    @GetMapping
    public String getTitle() {
        LOG.debug("getTitle");
        LOG.info("info: getTitle");
        LOG.warn("warn: getTitle");
        LOG.error("error: getTitle");
        System.out.println("springboot is starting...");
        return "Spring Boot";
    }
}
