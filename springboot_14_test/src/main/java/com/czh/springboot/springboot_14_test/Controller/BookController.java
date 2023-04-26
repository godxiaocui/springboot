package com.czh.springboot.springboot_14_test.Controller;

import com.czh.springboot.springboot_14_test.pojo.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {
    @GetMapping
    public String getById(){
        System.out.println("Springboot is running");
        return "springboot";
    }

    @GetMapping("/all")
    public Book getALL(){
        System.out.println("Springboot is running");
        return new Book(1,"books","ads");
    }
}
