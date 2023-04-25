package com.czh.springboot.springboot_08_ssmp.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.czh.springboot.springboot_08_ssmp.dao.BookDao;
import com.czh.springboot.springboot_08_ssmp.pojo.Book;
import com.czh.springboot.springboot_08_ssmp.service.IBookService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IBookServiceImpl extends ServiceImpl<BookDao, Book> implements IBookService {
    @Autowired
    private BookDao bookDao;

    public Boolean deleteById(Integer id) {
        return bookDao.deleteById(id)>0;
    }

    @Override
    public IPage<Book> getPage(Integer currentPage, Integer pageSize, Book book) {
        LambdaQueryWrapper<Book> bookLambdaQueryWrapper = new LambdaQueryWrapper<>();
        bookLambdaQueryWrapper.like(Strings.isNotEmpty(book.getType()),Book::getType,book.getType());
        bookLambdaQueryWrapper.like(Strings.isNotEmpty(book.getName()),Book::getName,book.getName());
        bookLambdaQueryWrapper.like(Strings.isNotEmpty(book.getDescription()),Book::getDescription,book.getDescription());
        IPage page = new Page<>(currentPage, pageSize);
        bookDao.selectPage(page, bookLambdaQueryWrapper);
        return page;
    }



}
