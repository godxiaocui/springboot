package com.czh.springboot.springboot_07_druid;

import com.czh.springboot.springboot_07_druid.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot07DruidApplicationTests {
@Autowired(required=true)
private BookDao bookDao;
	@Test
	void contextLoads() {
		System.out.println("*****************");
		System.out.println(bookDao.getById(1));
	}

}
