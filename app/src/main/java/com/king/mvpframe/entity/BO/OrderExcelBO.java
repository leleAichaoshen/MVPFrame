package com.king.mvpframe.entity.BO;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class OrderExcelBO implements Serializable {
    private static final long serialVersionUID = -7430477951217437224L;

    protected Integer id;
    //正常订单1 追加订单2 售后订单3
    private Integer orderType;

    //正常订单1 追加订单2 售后订单3
    private Integer orderStatus;

    //正常订单1 追加订单2 售后订单3
    private Integer orderSubStatus;
    //
    private BigDecimal orderMoney;
    //
    private String orderCount;

    private String goodName;
    //
    private String goodSale;
    //
    private Integer orderUserId;
    //
    private String weChatName;
    //
    private String addressUserName;
    //
    private String addressPhone;

    private String address;
    //
    private Integer orderCustomerId;
    //
    private Integer orderAddressId;

    protected Date crtTime;

    protected String remark;
}
