package com.czh.springboot.springboot_08_ssmp.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.czh.springboot.springboot_08_ssmp.controller.utils.R;
import com.czh.springboot.springboot_08_ssmp.pojo.Book;
import com.czh.springboot.springboot_08_ssmp.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//吐血如果找不到访问页面的话需要直接访问静态资源http://localhost:8080/static/pages/books.html
@org.springframework.web.bind.annotation.RestController
@RequestMapping("/books")
public class RestController2 {
    @Autowired
    private IBookService bookService;
    @GetMapping
    public R getAllBooks() {
        return  new R(true,bookService.list());
    }
    @PostMapping
    public R save(@RequestBody Book book) {
        return new R(bookService.save(book));
    }

    @PutMapping
    public R update(@RequestBody  Book book) {
        return new R(bookService.updateById(book));
    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable("id") Integer id) {
        return new R( bookService.deleteById(id));
    }

    @GetMapping("{id}")
    public R getBookById(@PathVariable Integer id) {

        return new R(true,bookService.getById(id));
    }

    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable("currentPage") Integer currentPage, @PathVariable("pageSize") Integer pageSize) {
        IPage<Book> bookPage = new Page<>();
        bookPage.setCurrent(currentPage);
        bookPage.setSize(pageSize);
        return new R(true,bookService.page(bookPage));
    }
}
