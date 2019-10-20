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
 * @version 2019-10-12 23:50:31
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class VipTotalInfo extends BaseEntity {
    //
    private Integer userId;
    private Date orderDate;
    private Boolean addOrderCommit;
    private Boolean problemOrderCommit;
    private Boolean normalOrderCommit;
    private BigDecimal orderReceiveTodayMoney;
    private BigDecimal orderNormalTodayMoney;
    private BigDecimal orderAddTodayMoney;
    private BigDecimal orderProblemTodayMoney;
}
