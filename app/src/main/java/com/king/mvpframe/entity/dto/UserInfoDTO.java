package com.king.mvpframe.entity.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;

@Data
public class UserInfoDTO implements Serializable {
    private static final long serialVersionUID = 7275373856403959447L;

    //@ApiModelProperty("登录名称")
    private String loginName;

    //  @ApiModelProperty("微信名称")
    private String weChatName;

   // @ApiModelProperty("追加订单提交状态")
    private Boolean addOrderCommit;
    //
    // @ApiModelProperty("问题订单提交装填")
    private Boolean problemOrderCommit;
    //正常订单
    //  @ApiModelProperty("正常订单提交状态")
    private Boolean normalOrderCommit;
    //今日接单费
    // @ApiModelProperty("今日接单费")
    private BigDecimal orderReceiveTodayMoney;
    //今日订单正常收益
    // @ApiModelProperty("日订单正常收益")
    private BigDecimal orderNormalTodayMoney;
    //今日订单加收收益
    // @ApiModelProperty("今日订单加收收益")
    private BigDecimal orderAddTodayMoney;
    //今日问题订单收益
//    @ApiModelProperty("今日问题订单收益")
    private BigDecimal orderProblemTodayMoney;
}
