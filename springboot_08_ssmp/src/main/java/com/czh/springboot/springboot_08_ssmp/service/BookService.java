package com.czh.springboot.springboot_08_ssmp.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.czh.springboot.springboot_08_ssmp.pojo.Book;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BookService {
    Boolean save(Book book);
    Boolean update(Book book);
    Boolean delete(Integer id);
    Book selectById(Integer id);
    List<Book> getBookList();

    IPage<Book> getPage(Integer currentPage,Integer pageSize);
}
