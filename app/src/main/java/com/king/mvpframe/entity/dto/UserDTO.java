package com.king.mvpframe.entity.dto;

import java.io.Serializable;


public class UserDTO implements Serializable {

    private static final long serialVersionUID = -168539893411136402L;
   // @NotBlank(message = "登录名不能为空")
   // @ApiModelProperty("登录名称")
    public String loginName;

    //@NotBlank(message = "登录名不能为空")
    //@ApiModelProperty("密码")
    public String password;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
