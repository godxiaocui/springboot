package com.czh.springboot.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 *   driver: com.mysql.cj.jdbc.Driver
 *   url: jdbc:mysql://localhost:3306/ssm?serverTimezone=UTC
 *   name: root
 *   password: czh66221183
 */
// 1。定义模型封装yml中的数据
// 2.定义为spring中的bean
@Component
// 3.指定加载的数据
@ConfigurationProperties(prefix ="datasource")
public class MyDatasource {
    private String driver;
    private String url;
    private String name;
    private String password;

    @Override
    public String toString() {
        return "MyDatasource{" +
                "driver='" + driver + '\'' +
                ", url='" + url + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public MyDatasource() {
    }

    public MyDatasource(String driver, String url, String name, String password) {
        this.driver = driver;
        this.url = url;
        this.name = name;
        this.password = password;
    }
}
