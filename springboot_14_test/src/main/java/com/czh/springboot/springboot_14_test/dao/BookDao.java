package com.czh.springboot.springboot_14_test.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.czh.springboot.springboot_14_test.pojo.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookDao extends BaseMapper<Book> {
}
