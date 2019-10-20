package com.king.mvpframe.entity.dto;

import java.io.Serializable;

import lombok.Data;
@Data
public class CustomerDTO implements Serializable {

    private static final long serialVersionUID = -1242035889977021020L;

    private Integer addressCustomerId;

    private Integer userId;

    private String customerRealName;

    private String weChatName;

    private Integer vipAddressId;

    private String addressUserName;
    //
    private String addressPhone;

    private String address;

    private Boolean isFirst;

}
