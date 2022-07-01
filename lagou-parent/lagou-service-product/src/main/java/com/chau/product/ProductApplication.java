package com.chau.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: wilfred
 * @CreateTime: 2022-07-01  18:19
 * @Description:
 */
@SpringBootApplication
@MapperScan("com.chau.product.mapper")
public class ProductApplication {

    public static void main(String[] args) {

        SpringApplication.run(ProductApplication.class, args);
    }
}
