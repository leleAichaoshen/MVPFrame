package com.king.mvpframe.entity;

import lombok.Data;

@Data
public class BaseR<T> {

    private int code;
    private String msg;
    private T t;


}
