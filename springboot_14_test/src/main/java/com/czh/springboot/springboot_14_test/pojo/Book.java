package com.czh.springboot.springboot_14_test.pojo;

import lombok.Data;

// 没有构造方法
@Data
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;

    public Book() {
    }

    public Book(Integer id, String type, String name, String description) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.description = description;
    }
}
