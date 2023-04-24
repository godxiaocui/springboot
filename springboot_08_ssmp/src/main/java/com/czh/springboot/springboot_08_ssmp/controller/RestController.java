package com.czh.springboot.springboot_08_ssmp.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.czh.springboot.springboot_08_ssmp.pojo.Book;
import com.czh.springboot.springboot_08_ssmp.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
//@RequestMapping("/books")
public class RestController {
    @Autowired
    private IBookService bookService;
    @GetMapping
    public List<Book> getAllBooks() {
        return  bookService.list();
    }
    @PostMapping
    public Boolean save(@RequestBody Book book) {
        return bookService.save(book);
    }

    @PutMapping
    public Boolean update(@RequestBody  Book book) {
        return bookService.updateById(book);
    }

    @DeleteMapping("{id}")
    public Boolean delete(@PathVariable("id") Integer id) {
        return bookService.deleteById(id);
    }

    @GetMapping("{id}")
    public Book getBookById(@PathVariable Integer id) {
        return bookService.getById(id);
    }

    @GetMapping("{currentPage}/{pageSize}")
    public IPage<Book> getPage(@PathVariable("currentPage") Integer currentPage, @PathVariable("pageSize") Integer pageSize) {
        IPage<Book> bookPage = new Page<>();
        bookPage.setCurrent(currentPage);
        bookPage.setSize(pageSize);

        return bookService.page(bookPage);
    }
}
