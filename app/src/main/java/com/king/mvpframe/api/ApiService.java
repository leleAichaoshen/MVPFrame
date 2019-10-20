package com.king.mvpframe.api;

import com.king.mvpframe.ConstantsHttp;
import com.king.mvpframe.entity.VipUser;
import com.king.mvpframe.entity.dto.UserDTO;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */

public interface ApiService {

    /**
     * 获取随机十条推荐的诗词
     * @return
     */
//    @POST("poetry/poetrys/randomTenPoetry")
//    Observable<Result<List<PoetryInfo>>> getRecommendPoetry();

    @POST(ConstantsHttp.LOGIN)
    Observable<VipUser> login(@Body UserDTO user);

//    @PUT(ConstantsHttp.UPPASW)
//    Observable<String> upDataPasw(@Body LogInBean logInBean);
//
//
//    @POST(ConstantsHttp.COUSTOMER)
//    Observable<String> getCoustomer(@Body CustomerDTO customerDTO);
//
//
//    @GET(ConstantsHttp.ADSSLIST)
//    Observable<String> getCustomerAdssList(@Path("customerId") String customerId);
//
//    @POST(ConstantsHttp.ADSSADD)
//    Observable<String> AddAdss(@Body AdssAddBean adssAddBean);
//
//    @PUT(ConstantsHttp.UPDATEADSS)
//    Observable<String> UpdateAdss(@Path("customerId") String customerId,@Path("addressId") String addressId);
//
//    @POST(ConstantsHttp.COUSTOMERADD)
//    Observable<String> addCoustomer(@Body CustomerAddBean customerDTO);
//
//    @POST(ConstantsHttp.GOODS)
//    Observable<String> getGoods(@Body CustomerDTO customerDTO);
//
//    @POST(ConstantsHttp.GOODSADD)
//    Observable<String> addGoods(@Body GoodsAddBean goodsAddBean);
//
//    @POST(ConstantsHttp.ORDERADD)
//    Observable<String> OrderAdd(@Body OrderAdd orderAdd);
//
//    @POST(ConstantsHttp.ORDERLIST)
//    Observable<String> getOrderList(@Body CustomerDTO customerDTO);
//
//    @PUT(ConstantsHttp.SALETYPE)
//    Observable<String> saleType(@Path("orderId") String orderId);
//
//    @PUT(ConstantsHttp.CHANGE_ORDER_PAY_STATUS)
//    Observable<String> changeOrderPayStatus(@Path("orderId") Integer orderId);

}
