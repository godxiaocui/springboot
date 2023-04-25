package com.czh.springboot.springboot_08_ssmp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springboot08SsmpApplication {

    public static void main(String[] args) {
        // 这里面的arg 可以在后面自己修改
        String[] strings = new String[1];
        strings[0]="--server.port=8082";
        SpringApplication.run(Springboot08SsmpApplication.class, args);
    }

}
