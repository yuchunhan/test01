package com.hongzhi.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan(basePackages = "com.hongzhi.springboot.mapper")//开启扫描Mapper接口的子包以及子目录
//@EnableTransactionManagement//开启事务(可选项)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
