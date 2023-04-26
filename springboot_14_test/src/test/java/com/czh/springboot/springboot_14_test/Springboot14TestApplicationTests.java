package com.czh.springboot.springboot_14_test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 1。 @SpringBootTest
 * 这个注解可以在properties类型中增加临时属性
 * 参考properties = {"test.prop=testValue1"}
 * 2. 还有一种格式是args里增加属性，采用的args加数组
 *  args 里加的是字符串
 *  args = {"--test.bro=bro","test.prop=testValue2"}
 * @Value 可以为在yml文件或者在@SpringBootTest 的properties属性值付值
 */
@SpringBootTest(properties = {"test.prop=testValue1"},args = {"--test.bro=bro","test.prop=testValue2"})
class Springboot14TestApplicationTests {

    @Value("${test.prop}")
    private String msg;

    @Value("${test.bro}")
    private String test;

    @Test
    void contextLoads() {
        System.out.println(msg);
        System.out.println(test);
    }

}
