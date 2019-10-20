package com.king.mvpframe.entity;

import java.math.BigDecimal;

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
public class VipCustomer extends BaseEntity {

//    @ApiModelProperty("用户id")
    private Integer userId;
    //
//    @ApiModelProperty("客户真实名称")
    private String customerRealName;
    //
//    @ApiModelProperty("微信名称")
    private String weChatName;
    //
//    @ApiModelProperty("消费次数")
    private Integer payCount;
    //
//    @ApiModelProperty("问题单子次数")
    private Integer problemPaid;
    //
//    @ApiModelProperty("累计消费")
    private BigDecimal payTotalMoney;
    //
//    @ApiModelProperty("累计优惠价格")
    private BigDecimal preferentialTotalMoney;
    //
//    @ApiModelProperty("累计返回价格")
    private BigDecimal returnTotalMoney;
}
