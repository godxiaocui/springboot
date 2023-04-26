package com.czh.springboot.springboot_14_test.config.MsgConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MsgConfigTest {

    @Bean
    public String msg(){
        return "Hello";
    }
}
