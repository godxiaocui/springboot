package com.czh.springboot.springboot_14_test.service.impl;

import com.czh.springboot.springboot_14_test.dao.BookDao;
import com.czh.springboot.springboot_14_test.pojo.Book;
import com.czh.springboot.springboot_14_test.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplBookService implements BookService {
    @Autowired
    private BookDao bookDao;
    @Override
    public boolean save(Book book) {
        return bookDao.insert(book)>0;
    }
}
