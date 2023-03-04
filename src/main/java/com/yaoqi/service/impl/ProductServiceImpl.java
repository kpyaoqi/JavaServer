package com.yaoqi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yaoqi.entity.Product;
import com.yaoqi.mapper.ProductMapper;
import com.yaoqi.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yaoqi
 * @since 2023-03-04
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {
    @Override
    public List<Product> getProduct(String productStatus) {
        QueryWrapper<Product> wrapper = new QueryWrapper<>();
        int current_time = Math.round(System.currentTimeMillis () / 1000);
        if (productStatus.equals("finalize")) {
            wrapper.lt("auctionEndTime",current_time-200);
        } else if (productStatus.equals("reveal")) {
            wrapper.lt("auctionEndTime",current_time).gt("auctionEndTime",current_time-200);
        } else {
            wrapper.lt("auctionStartTime",current_time).gt("auctionEndTime",current_time);
        }
        List<Product> products=baseMapper.selectList(wrapper);
        return products;
    }
}
