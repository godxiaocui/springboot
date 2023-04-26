package com.czh.springboot.springboot_14_test;

import com.czh.springboot.springboot_14_test.config.MsgConfig.MsgConfigTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

/**
 * 倒入额外的配置bean需要用@Import
 */
@SpringBootTest
@Import(MsgConfigTest.class)
public class ConfigurationTest {

    @Autowired
    private String msg;
    @Test
    void configure() {
        System.out.println(msg);
    }
}
