package com.czh.springboot.springboot_06mabatiplus.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.czh.springboot.springboot_06mabatiplus.pojo.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookDao extends BaseMapper<Book> {
}
