package com.chau.page.controller;

import com.chau.common.pojo.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: wilfred
 * @CreateTime: 2022-07-01  18:25
 * @Description:
 */
@RestController
@RequestMapping("/page")
public class PageController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getProduct/{id}")
    public Products getProduct(@PathVariable Integer id) {

        String url = "http://127.0.0.1:9000/product/query/" + id;
        return restTemplate.getForObject(url, Products.class);
    }
}
