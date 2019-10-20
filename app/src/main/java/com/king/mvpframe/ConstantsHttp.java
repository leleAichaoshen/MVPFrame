package com.king.mvpframe;

import java.io.File;

public class ConstantsHttp {

    //================= PATH ====================
    public static final String PATH_DATA = App.getInstance().getCacheDir().getAbsolutePath() + File.separator + "data";
    public static final String PATH_CACHE = PATH_DATA + "/NetCache";

    /**
     * 服务器地址
     */
    public static  String URL_SERVER = "http://39.106.209.218:8080";

    //登录
    public static final String LOGIN = "/vipUser/login";

    //修改密码
    public static final String UPPASW = "/vipUser/update";

    //分页获取客户列表+模糊搜索
    public static final String COUSTOMER = "/vipCustomer/pageList";

    //客户添加 /vipCoustomer/saveUpdate
    public static final String COUSTOMERADD = "/vipCustomer/saveUpdate";

    //获取客户地址
    public static final String ADSSLIST = "/vipAddress/addressList/{customerId}";

    //添加客户地址  /vipAddress/saveUpdate
    public static final String ADSSADD = "/vipAddress/saveUpdate";

    // 修改默认地址 /vipAddress/updateDefault/{customerId}/{addressId}
    public static final String UPDATEADSS = "/vipAddress/updateDefault/{customerId}/{addressId}";

    //商品列表 /vipGood/pageList
    public static final String GOODS = "/vipGood/pageList";

    //商品新增  /vipGood/saveUpdate
    public static final String GOODSADD = "/vipGood/saveUpdate";

    //订单创建
    public static final String ORDERADD = "/vipOrder/save" ;

    //订单列表获取  /vipOrder/pageList
    public static final String ORDERLIST = "/vipOrder/pageList";

    //修改订单状态为售后 /vipOrder/saleType/{orderId}
    public static final String SALETYPE = "/vipOrder/saleType/{orderId}";

    //修改订单已付款和未付款切换
    public static final String CHANGE_ORDER_PAY_STATUS = "/vipOrder/payType/{orderId}";
}
