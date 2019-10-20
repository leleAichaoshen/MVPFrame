package com.king.mvpframe.entity.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;

@Data
public class OrderTypeDTO implements Serializable {
    private static final long serialVersionUID = 8764699462078835306L;

    //   @ApiModelProperty("订单类型")
    private Integer orderType;
    // @ApiModelProperty("订单总数")
    private Integer orderCount;
    //@ApiModelProperty("总钱数")
    private BigDecimal orderTotalMoney;
    //@ApiModelProperty("用户收益")
    private BigDecimal orderTotalUserMoney;
    //@ApiModelProperty("直属收益")
    private BigDecimal orderTotalAdminMoney;
}
