package com.czh.springboot.springboot_03_junit;

import com.czh.springboot.springboot_03_junit.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot03JunitApplicationTests {
    //1.注入你要测试的对象
    @Autowired
    private BookDao bookDao;
    //2.执行测试对象的对应方法

    @Test
    void contextLoads() {
        bookDao.save();
    }

}
