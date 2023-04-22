package com.czh.spring.springboot_04_druid.dao;


import com.czh.springboot.springboot_05_mybatis.pojo.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookDao {
    @Select("select * from tbl_book where id = #{id}")
    Book getById(@Param("id") Integer id);
}
