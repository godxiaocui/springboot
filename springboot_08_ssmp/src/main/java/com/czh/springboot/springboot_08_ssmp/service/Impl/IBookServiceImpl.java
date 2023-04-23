package com.czh.springboot.springboot_08_ssmp.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.czh.springboot.springboot_08_ssmp.dao.BookDao;
import com.czh.springboot.springboot_08_ssmp.pojo.Book;
import com.czh.springboot.springboot_08_ssmp.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IBookServiceImpl extends ServiceImpl<BookDao, Book> implements IBookService {
    @Autowired
    private BookDao bookDao;

    public Boolean deleteById(Integer id) {
        return bookDao.deleteById(id)>0;
    }
}
