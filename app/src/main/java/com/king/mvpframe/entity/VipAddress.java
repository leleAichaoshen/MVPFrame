package com.king.mvpframe.entity;

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
public class VipAddress extends BaseEntity {
    private static final long serialVersionUID = 6464625269132396402L;
    //
   // @ApiModelProperty("客户id")
    private Integer customerId;
    //
    //@ApiModelProperty("收件人姓名")
    private String addressUserName;
    //
    //@ApiModelProperty("收件人手机号")
    private String addressPhone;

    //@ApiModelProperty("收件人地址")
    private String address;
    //
   // @ApiModelProperty("是否为默认地址新建为true")
    private Boolean isFirst;

}
