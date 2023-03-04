package com.yaoqi.controller;


import com.yaoqi.entity.Product;
import com.yaoqi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yaoqi
 * @since 2023-03-04
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("/saveProduct")
    public Boolean saveProduct(@RequestBody Map<String, String> data) {
        Product product = new Product();
        product.setBlockchainId(Integer.valueOf(data.get("blockchainId")));
        product.setProductName(data.get("name"));
        product.setCategory(data.get("category"));
        product.setIpfsImageHash(data.get("ipfsImageHash"));
        product.setIpfsDescHash(data.get("ipfsDescHash"));
        product.setAuctionStartTime(Long.valueOf(data.get("auctionStartTime")));
        product.setAuctionEndTime(Long.valueOf(data.get("auctionEndTime")));
        product.setPrice(data.get("price"));
        product.setProductCondition(Integer.valueOf(data.get("condition")));
        product.setProductStatus(Integer.valueOf(data.get("productStatus")));
        productService.save(product);
        return true;
    }

    @RequestMapping("/allProduct")
    public List<Product> allProduct(@RequestParam(defaultValue = "being") String productStatus) {
        List<Product> allProduct =productService.getProduct(productStatus);
        return allProduct;
    }
}

