package com.czh.springboot.springboot_13_configuration.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;

//@Component
@Data
@ConfigurationProperties(prefix = "servers")
// 2. 开启当前bean的属性注入校验
@Validated
public class ServerConfig {
    private String idAddress;
    @Max(value = 88,message = "localhost")
    private int port;
    private long timeout;

}
