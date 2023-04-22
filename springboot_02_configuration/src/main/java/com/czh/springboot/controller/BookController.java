package com.czh.springboot.controller;

import com.czh.springboot.pojo.MyDatasource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {
    // 读取yml中的数据
    @Value("${country}")
    private String country;
    @Value("${user.name}")
    private String name1;
    @Value("${tempDir}")
    private String tempDir;

    @Value("${tempDir1}")
    private String tempDir1;

    // 自动装配，将所有的yml中的数据封装到env
    @Autowired
    private Environment env;
    @Autowired
    private MyDatasource    myDatasource;
    @GetMapping
    public String getTitle() {
        System.out.println(country);
        System.out.println(name1);
        System.out.println(tempDir);
        System.out.println(tempDir1);
        System.out.println("*****************");
        System.out.println(env.getProperty("user.name"));
        System.out.println("springboot is starting...ccccc");
        System.out.println(myDatasource);
        return "Spring Boot....c";
    }
}
