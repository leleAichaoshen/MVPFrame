package com.king.mvpframe.entity.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;

@Data
public class GroupDTO implements Serializable {
    private static final long serialVersionUID = 4212462838696368840L;
    
    private Integer todayOrderGroupCount;

    private Integer todayOrderGroupPaidCount;

    private Integer todayOrderGroupUnpaidCount;

    private Integer todayOrderGroupAddCount;

    private Integer todayOrderGroupProblemCount;

    private BigDecimal groupSurplusMoney;

    private Integer goodGroupCount;

    private BigDecimal todayGroupAccount;

    private BigDecimal todayOrderAdminGainMoney;

}
