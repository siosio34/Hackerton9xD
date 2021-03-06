package com.gunghi.tgwing.hackerton9xd.network.service;

import com.gunghi.tgwing.hackerton9xd.network.response.ResKakaoBasicInfo;
import com.gunghi.tgwing.hackerton9xd.network.response.ResKakaoBlog;
import com.gunghi.tgwing.hackerton9xd.network.response.ResKakaoKeywordAPI;
import com.gunghi.tgwing.hackerton9xd.network.response.ResKakaoLocalAPI;
import com.gunghi.tgwing.hackerton9xd.network.response.ResKakaoPhoto;
import com.gunghi.tgwing.hackerton9xd.network.response.ResRanking;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by joyeongje on 2017. 9. 9..
 */

public interface KakaoService {

    // 다음 api.
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

    @GET("http://p.winterj.me:9090/get/daum/{id}/basicInfo")
    Call<ResKakaoBasicInfo> getBasicInfoData(@Path("id") String id);

    // 상세 url.
    @GET("http://p.winterj.me:9090/get/daum/{id}/blogReview")
    Call<ResKakaoBlog> getBlogData(@Path("id")String id);

    @GET("http://p.winterj.me:9090/get/daum/{id}/photo")
    Call<ResKakaoPhoto> getPhotoData(@Path("id")String id);



    // 랭킹 리스트.
    @GET("http://p.winterj.me:9090/get/rank")
    Call<ResRanking> getRankingData();

}
