package com.yaoqi.mapper;

import com.yaoqi.entity.Product;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yaoqi
 * @since 2023-03-04
 */
@Mapper
public interface ProductMapper extends BaseMapper<Product> {

}
