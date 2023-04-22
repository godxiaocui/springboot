package com.czh.springboot.springboot_03_junit.dao.Impl;

import com.czh.springboot.springboot_03_junit.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao is running");
    }
}
