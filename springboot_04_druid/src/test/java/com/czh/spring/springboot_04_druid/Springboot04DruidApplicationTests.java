package com.czh.spring.springboot_04_druid;

import com.czh.spring.springboot_04_druid.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot04DruidApplicationTests {
@Autowired
private BookDao bookDao;
    @Test
    void contextLoads() {
        System.out.println(bookDao.getById(1));
    }

}
