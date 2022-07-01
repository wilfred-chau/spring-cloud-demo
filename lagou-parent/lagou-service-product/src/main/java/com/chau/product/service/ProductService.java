package com.chau.product.service;

import com.chau.common.pojo.Products;

/**
 * @Author: wilfred
 * @CreateTime: 2022-07-01  18:19
 * @Description:
 */
public interface ProductService {

    Products queryById(Integer id);
}
