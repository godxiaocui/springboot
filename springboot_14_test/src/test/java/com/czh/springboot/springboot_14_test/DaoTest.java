package com.czh.springboot.springboot_14_test;

import com.czh.springboot.springboot_14_test.pojo.Book;
import com.czh.springboot.springboot_14_test.service.BookService;
import com.czh.springboot.springboot_14_test.test.domaian.BookCase;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

/**
 * 不要影响数据
 * 增加事务功能
 * @Transactional
 * @Rollback(true)等于没有加，默认是true开启事务
 * @Rollback(false)关闭事务
 */
@SpringBootTest
@Transactional
@Rollback(true)
public class DaoTest {
    @Autowired
    private BookService bookService;

    @Autowired
    private BookCase bookCase;

    @Test
    void testSave(){
        Book book = new Book();
        book.setName("Springboot2");
        book.setType("Springboot2");
        book.setDescription("Spring Boot2");
        bookService.save(book);
    }

    @Test
    void testRandom(){
        System.out.println(bookCase);
    }
}
