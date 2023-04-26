package com.czh.springboot.springboot_14_test.service;

import com.czh.springboot.springboot_14_test.pojo.Book;
import org.springframework.stereotype.Service;


public interface BookService {

    public boolean save(Book book);
}
