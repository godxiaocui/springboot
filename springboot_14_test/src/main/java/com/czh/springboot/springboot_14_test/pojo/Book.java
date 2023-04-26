package com.czh.springboot.springboot_14_test.pojo;

import lombok.Data;

@Data
public class Book {
    private int id;
    private String name;
    private String description;

    public Book() {
    }

    public Book(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}
