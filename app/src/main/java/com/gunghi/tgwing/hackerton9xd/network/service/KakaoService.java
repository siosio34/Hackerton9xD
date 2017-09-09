package com.gunghi.tgwing.hackerton9xd.network.service;

import com.gunghi.tgwing.hackerton9xd.network.response.ResKakaoBasicInfo;
import com.gunghi.tgwing.hackerton9xd.network.response.ResKakaoBlog;
import com.gunghi.tgwing.hackerton9xd.network.response.ResKakaoKeywordAPI;
import com.gunghi.tgwing.hackerton9xd.network.response.ResKakaoLocalAPI;
import com.gunghi.tgwing.hackerton9xd.network.response.ResKakaoPhoto;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/**
 * Created by joyeongje on 2017. 9. 9..
 */

public interface KakaoService {

   // https://dapi.kakao.com/v2/local/search/category.json?category_group_code=CE7&rect=127.0561466,37.5058277,127.0602340,37.5142554
    //      @Query("radius") int radius


    @GET("/v2/local/search/category.json")
    Call<ResKakaoLocalAPI> getCafeList(
            @Header("Authorization") String apikey,
            @Query("category_group_code") String catrgory,
            @Query("x") String x,
            @Query("y") String y,
            @Query("radius") int radius
    );

    @GET("/v2/local/search/keyword.json")
    Call<ResKakaoKeywordAPI> getLocaleByKeyword(
            @Header("Authorization") String apikey,
            @Query("query") String query
    );

    @GET("http://p.winterj.me:9090/get/daum/653245473/blogReview")
    Call<ResKakaoBlog> getBlogData();

    @GET("http://p.winterj.me:9090/get/daum/653245473/photo")
    Call<ResKakaoPhoto> getPhotoData();

    @GET("http://p.winterj.me:9090/get/daum/653245473/basicInfo")
    Call<ResKakaoBasicInfo> getBasicInfoData();




}
