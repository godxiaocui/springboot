package com.czh.springboot.springboot_08_ssmp.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.czh.springboot.springboot_08_ssmp.pojo.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.management.Query;

@SpringBootTest
public class BookDaoTestCase {
    @Autowired
    private BookDao bookDao;

    @Test
    void testGetById(){
        System.out.println(bookDao.selectById(1));
    }
@Test
    void testsave(){
    Book book = new Book();
    book.setName("js");
    book.setType("最好的语言");
    book.setDescription("Javascript");
    bookDao.insert(book);
}

    @Test
    void testUpdate(){
        Book book = new Book();
        book.setId(13);
        book.setName("js123213");
        book.setType("最好的语言123123");
        book.setDescription("Javascrip12312321t");
        bookDao.updateById(book);
    }
    @Test
    void testDelete(){
        bookDao.deleteById(13);
    }
    @Test
    void testGetAll(){
     bookDao.selectList(null);
    }
// 分页功能需要加拦截器，拦截器再config里配置
    @Test
    void testGetPage(){
        IPage page = new Page(2,5);
        bookDao.selectPage(page,null);
    }
    @Test
    void testGetBy(){
        QueryWrapper<Book> qw = new QueryWrapper<>();
        qw.like("name","Spring");
        bookDao.selectList(qw);
    }

    @Test
    void testGetBy2(){
        String name="Spring";
        LambdaQueryWrapper<Book> bw = new LambdaQueryWrapper<>();
        bw.like(name !=null,Book::getName,name);
        bookDao.selectList(bw);
    }
}
