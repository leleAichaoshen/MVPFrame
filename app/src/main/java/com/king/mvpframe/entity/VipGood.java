package com.king.mvpframe.entity;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * 
 * 
 * @author 
 * @email 
 * @version 2019-10-01 23:30:55
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class VipGood extends BaseEntity {
    //
//    @ApiModelProperty("组id")
    private Integer groupId;
    //
//    @ApiModelProperty("商品名称")
    private String goodName;
    //
//    @ApiModelProperty("规格")
    private String goodSale;
    //
//    @ApiModelProperty("有效时间")
    private Date goodSaleTime;
    //
//    @ApiModelProperty("剩余")
    private Integer goodLeft;
    //
//    @ApiModelProperty("销售价格")
    private BigDecimal goodMoney;
    //
//    @ApiModelProperty("用户收益")
    private BigDecimal goodUserMoney;
    //
//    @ApiModelProperty("直属收益")
    private BigDecimal goodAdminMoney;
}
