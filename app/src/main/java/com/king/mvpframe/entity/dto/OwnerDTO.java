package com.king.mvpframe.entity.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;

@Data
public class OwnerDTO implements Serializable {
    private static final long serialVersionUID = 4212462838696368840L;

   // @ApiModelProperty("今日订单(已付款)总数")
    private Integer todayOrderPaidCount;

    //@ApiModelProperty("今日订单(未付款)总数")
    private Integer todayOrderUnpaidCount;

    //@ApiModelProperty("今日订单(追加)总数")
    private Integer todayOrderAddCount;

    //@ApiModelProperty("今日订单(售后)总数")
    private Integer todayOrderProblemCount;

    //@ApiModelProperty("今日订单总数")
    private Integer todayOrderCount;

    //@ApiModelProperty("今日个人销售额")
    private BigDecimal todayAccount;

    //@ApiModelProperty("今日个人利润")
    private BigDecimal todayOrderOwnerGainMoney;

}
