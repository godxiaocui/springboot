package com.czh.spring.demo.dao;

import com.czh.spring.demo.pojo.Book;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookDao {
    @Select("select * from tbl_book where id = #{id}")
    Book getById(@Param("id") Integer id);
}
