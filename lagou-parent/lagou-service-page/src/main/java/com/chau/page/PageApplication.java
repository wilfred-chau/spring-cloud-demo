package com.chau.page;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: wilfred
 * @CreateTime: 2022-07-01  18:24
 * @Description:
 */
@SpringBootApplication
public class PageApplication {

    public static void main(String[] args) {

        SpringApplication.run(PageApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
