package com.czh.springboot.springboot_14_test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.ContentResultMatchers;
import org.springframework.test.web.servlet.result.HeaderResultMatchers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.result.StatusResultMatchers;

/**
 * 1.增加web环境的测试，原有的框架是没有web环境的
 * @SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)不开启web环境
 * @SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT) 开启端口
 * @SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT) 开启随机端口
 * 2.虚拟调用的模式，需要开启虚拟调用的模式
 * a.开启虚拟调用的开关@AutoConfigureMockMvc
 * b.开启自动装配
 * @Autowired
 * private MockMvc mvc;
 * 创建虚拟请求 RequestBuilder bulider = MockMvcRequestBuilders.get("/books");
 * 执行对应请求 mvc.perform(bulider);
 * 3. 开启测试
 * a.设定预期值越真实值做比较，成功测试通过，失败测试失败
 * b.定义本次调用预期值
 */

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class WebTest {
    @Autowired
    private MockMvc mvc;
    // 测试响应状态
    @Test
    void test() throws Exception {
        //http://localhost:8080/books
        //创建虚拟请求
        RequestBuilder bulider = MockMvcRequestBuilders.get("/books123");
        // 执行对应请求
        ResultActions perform = mvc.perform(bulider);
        //设定预期值越真实值做比较，成功测试通过，失败测试失败
        // 定义本次调用预期值
        StatusResultMatchers status = MockMvcResultMatchers.status();
        // 调用成功就是200
        ResultMatcher ok = status.isOk();
        //  添加预计值到本次调用
        perform.andExpect(ok);
    }


    // 测试响应体
    @Test

    void testBody() throws Exception {
        //http://localhost:8080/books
        //创建虚拟请求
        RequestBuilder bulider = MockMvcRequestBuilders.get("/books");
        // 执行对应请求
        ResultActions perform = mvc.perform(bulider);
        //设定预期值越真实值做比较，成功测试通过，失败测试失败

        ContentResultMatchers content = MockMvcResultMatchers.content();
        ResultMatcher springboot = content.string("springboot2");
        //  添加预计值到本次调用
        perform.andExpect(springboot);
    }


    // 测试json
    @Test

    void testJson() throws Exception {
        //http://localhost:8080/books
        //创建虚拟请求
        RequestBuilder bulider = MockMvcRequestBuilders.get("/books/all");
        // 执行对应请求
        ResultActions perform = mvc.perform(bulider);
        //设定预期值越真实值做比较，成功测试通过，失败测试失败

        ContentResultMatchers content = MockMvcResultMatchers.content();
        // 意思意思
        ResultMatcher json = content.json("{\"id\":1,\"name\":\"book2\",\"description\":\"ads\"}");
        //  添加预计值到本次调用
        perform.andExpect(json);
    }
    // 测试Contenttype
    @Test

    void testContenttype() throws Exception {
        //http://localhost:8080/books
        //创建虚拟请求
        RequestBuilder bulider = MockMvcRequestBuilders.get("/books");
        // 执行对应请求
        ResultActions perform = mvc.perform(bulider);
        //设定预期值越真实值做比较，成功测试通过，失败测试失败
        HeaderResultMatchers header = MockMvcResultMatchers.header();

        ResultMatcher string = header.string("Content-Type", "application/json");
        perform.andExpect(string);
        // 意思意思

    }
}
