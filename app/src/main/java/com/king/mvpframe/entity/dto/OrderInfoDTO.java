package com.king.mvpframe.entity.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class OrderInfoDTO implements Serializable {
    private static final long serialVersionUID = -4943800875659547971L;

    //正常订单1 追加订单2 售后订单3
    private Integer orderType;
    //
    private Integer orderCount;
    //
    private Integer orderCustomerId;
    //
    private Integer orderAddressId;
    private Integer orderGoodId;
}
