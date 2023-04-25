package com.czh.springboot.springboot_13_configuration;

import com.alibaba.druid.pool.DruidDataSource;
import com.czh.springboot.springboot_13_configuration.config.ServerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * 配置三方库的需求
 * 1. EnableConfigurationProperties，加配置之后，再在其他的配置类中就无需加@Component注解了因为这个注解已经默认他是一个bean了
 * 2.  @ConfigurationProperties 中的的文字怎么写，大小写符号都无所谓
 */
@SpringBootApplication
@EnableConfigurationProperties(ServerConfig.class)
public class Springboot13ConfigurationApplication {

	/**
	 * 引入第三方bean方法
	 * 1. 可以在外面按照ServerConfig的配置
	 * 2. 也可以这里直接配置，因为 SpringBootApplication 因为这个自带配置信息
	 * @param
	 */
	@Bean
 @ConfigurationProperties(prefix="datasource")
	public DruidDataSource dataSource(){
		DruidDataSource druidDataSource = new DruidDataSource();
		// druidDataSource.setDriverClassName("com.mysql.druid.123");
		return druidDataSource;
	}
	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Springboot13ConfigurationApplication.class, args);
		ServerConfig bean = run.getBean(ServerConfig.class);
		DruidDataSource bean1 = run.getBean(DruidDataSource.class);
		System.out.println(bean1.getDriverClassName());
		System.out.println(bean);
	}

}
