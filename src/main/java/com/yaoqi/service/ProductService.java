package com.yaoqi.service;

import com.yaoqi.entity.Product;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yaoqi
 * @since 2023-03-04
 */
public interface ProductService extends IService<Product> {
    List<Product> getProduct(String productStatus);
}
