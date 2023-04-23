package com.czh.springboot.springboot_08_ssmp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.czh.springboot.springboot_08_ssmp.pojo.Book;

/**
 * mp自带的接口方法，代替我们写的很复杂的接口
 */
public interface IBookService extends IService<Book> {


    Boolean deleteById(Integer id);
}
