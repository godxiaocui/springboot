package com.czh.spring.demo;

import com.czh.spring.demo.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
@Autowired
private BookDao bookDao;
    @Test
    void contextLoads() {
        System.out.println(bookDao.getById(1));
    }

}
