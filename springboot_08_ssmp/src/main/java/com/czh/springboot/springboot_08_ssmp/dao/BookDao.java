package com.czh.springboot.springboot_08_ssmp.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.czh.springboot.springboot_08_ssmp.pojo.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookDao extends BaseMapper<Book> {
}
