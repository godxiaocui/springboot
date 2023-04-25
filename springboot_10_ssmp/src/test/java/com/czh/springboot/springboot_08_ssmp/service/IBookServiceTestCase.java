package com.czh.springboot.springboot_08_ssmp.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.czh.springboot.springboot_08_ssmp.pojo.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class IBookServiceTestCase {
    @Autowired
    private IBookService bookService;
    @Test
    void testGetById(){

        bookService.getById(1);
        System.out.println( bookService.getById(1));
    }
    @Test
    void testGetPage(){
        IPage<Book> bookPage = new Page<>(2, 5);
        IPage<Book> page = bookService.page(bookPage);
        System.out.println(page.getCurrent());
        System.out.println(page.getPages());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getRecords());
    }
}
