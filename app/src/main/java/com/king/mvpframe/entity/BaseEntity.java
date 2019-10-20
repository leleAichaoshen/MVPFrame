package com.king.mvpframe.entity;


import java.io.Serializable;
import java.util.Date;


public class BaseEntity implements Serializable {
    private static final long serialVersionUID = -117519421689510032L;
    // 主键
    protected Integer id;

    protected Integer crtUserId;

    // 创建时间
    protected Date crtTime;

    // 更新时间
    protected Date updTime;

    // 扩展字段1
    protected String remark;

    // 扩展字段1
    protected String field1;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCrtUserId() {
        return crtUserId;
    }

    public void setCrtUserId(Integer crtUserId) {
        this.crtUserId = crtUserId;
    }

    public Date getCrtTime() {
        return crtTime;
    }

    public void setCrtTime(Date crtTime) {
        this.crtTime = crtTime;
    }

    public Date getUpdTime() {
        return updTime;
    }

    public void setUpdTime(Date updTime) {
        this.updTime = updTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }
}
