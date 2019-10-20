package com.king.mvpframe.entity;

import java.math.BigDecimal;

import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 *
 *
 * @author
 * @email
 * @version 2019-10-05 10:13:55
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class VipGroup extends BaseEntity {

    //剩余钱数
//    @ApiModelProperty("")
    private BigDecimal surplusMoney;
    //充值总额
//    private BigDecimal rechargeTotalMoney;
    //赠送金额
    private BigDecimal presenterTotalMoney;
    //
    private String groupName;
}
