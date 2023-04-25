package com.czh.springboot.springboot_08_ssmp.pojo;

import lombok.Data;



// 没有构造方法
@Data
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;

}
