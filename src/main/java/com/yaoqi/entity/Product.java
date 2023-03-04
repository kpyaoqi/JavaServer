package com.yaoqi.entity;

import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author yaoqi
 * @since 2023-03-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Product implements Serializable {

    private static final long serialVersionUID=1L;

    @TableField("blockchainId")
    private Integer blockchainId;

    @TableField("productName")
    private String productName;

    private String category;

    @TableField("ipfsImageHash")
    private String ipfsImageHash;

    @TableField("ipfsDescHash")
    private String ipfsDescHash;

    @TableField("auctionStartTime")
    private Long auctionStartTime;

    @TableField("auctionEndTime")
    private Long auctionEndTime;

    private String price;

    @TableField("productCondition")
    private Integer productCondition;

    @TableField("productStatus")
    private Integer productStatus;


}
