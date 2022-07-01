package com.chau.product.service.impl;

import com.chau.common.pojo.Products;
import com.chau.product.mapper.ProductMapper;
import com.chau.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: wilfred
 * @CreateTime: 2022-07-01  18:20
 * @Description:
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public Products queryById(Integer id) {
        return productMapper.selectById(id);
    }
}
