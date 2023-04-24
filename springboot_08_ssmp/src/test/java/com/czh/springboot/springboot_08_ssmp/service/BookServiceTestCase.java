package com.czh.springboot.springboot_08_ssmp.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.czh.springboot.springboot_08_ssmp.pojo.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTestCase {
    @Autowired
    private BookService bookService;
    @Test
    void testGetById(){

        bookService.getBookList();
        System.out.println(bookService.getBookList());
    }
    @Test
    void testGetPage(){
        IPage<Book> pade = bookService.getPage(2, 5);
        System.out.println(pade.getCurrent());
        System.out.println(pade.getPages());
        System.out.println(pade.getSize());
        System.out.println(pade.getTotal());
        System.out.println(pade.getRecords());
    }
}
