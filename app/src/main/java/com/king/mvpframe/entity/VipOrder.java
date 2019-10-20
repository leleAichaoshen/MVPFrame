package com.king.mvpframe.entity;

import java.math.BigDecimal;

import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * @author
 * @version 2019-10-03 21:31:11
 * @email
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class VipOrder extends BaseEntity {
    private static final long serialVersionUID = -8259884901715251854L;
    //正常订单1 追加订单2 售后订单3
//    @ApiModelProperty("全部订单0 付款订单1 未付款2 追加订单3 售后订单4 ,初始默认已付款 ")
    private Integer orderType;

    //    @ApiModelProperty("0未提交,1已提交")
    private Boolean orderStatus;

    //    @ApiModelProperty("0未处理,1已处理")
    private Boolean orderSubStatus;
    //
//    @ApiModelProperty("订单价格")
    private BigDecimal orderMoney;
    //
//    @ApiModelProperty("直属收益")
    private BigDecimal orderAdminMoney;
    //
//    @ApiModelProperty("个人收益")
    private BigDecimal orderUserMoney;
    //
//    @ApiModelProperty("归属group")
    private Integer orderGroupId;
    //
//    @ApiModelProperty("订单数目")
    private Integer orderCount;
    //
//    @ApiModelProperty("归属用户id")
    private Integer orderUserId;
    //
//    @ApiModelProperty("客户id")
    private Integer orderCustomerId;
    //
//    @ApiModelProperty("地址id")
    private Integer orderAddressId;

    //    @ApiModelProperty("商品id")
    private Integer orderGoodId;
}
