package com.chau.product.controller;

import com.chau.common.pojo.Products;
import com.chau.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wilfred
 * @CreateTime: 2022-07-01  18:21
 * @Description:
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/query/{id}")
    public Products queryById( @PathVariable Integer id) {

        return productService.queryById(id);
    }
}
