package com.gunghi.tgwing.hackerton9xd.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gunghi.tgwing.hackerton9xd.R;
import com.gunghi.tgwing.hackerton9xd.application.Hackerton9xdApplication;
import com.gunghi.tgwing.hackerton9xd.network.response.ResKakaoBasicInfo;
import com.gunghi.tgwing.hackerton9xd.network.response.ResKakaoBlog;
import com.gunghi.tgwing.hackerton9xd.network.response.ResKakaoPhoto;
import com.gunghi.tgwing.hackerton9xd.network.service.KakaoService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;


public class SwipeCafeFragment extends Fragment {

    public SwipeCafeFragment() {



    // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Retrofit retrofit =  Hackerton9xdApplication.getRetrofitByServer();
        KakaoService kakaoService = retrofit.create(KakaoService.class);

        // 베이식 인포
        final Call<ResKakaoBasicInfo> call = kakaoService.getBasicInfoData();
        call.enqueue(new Callback<ResKakaoBasicInfo>() {
            @Override
            public void onResponse(Call<ResKakaoBasicInfo> call, Response<ResKakaoBasicInfo> response) {

                if(response.isSuccessful()) {
                    int count = 0;
                    ResKakaoBasicInfo body = response.body();
                    Log.d("ResKakaoBasicInfo", body.toString());

                }

            }

            @Override
            public void onFailure(Call<ResKakaoBasicInfo> call, Throwable t) {
                Log.d("Falied", call.toString());
            }
        });

        // 블로그
        final Call<ResKakaoBlog> call2 = kakaoService.getBlogData();
        call2.enqueue(new Callback<ResKakaoBlog>() {
            @Override
            public void onResponse(Call<ResKakaoBlog> call, Response<ResKakaoBlog> response) {

                if(response.isSuccessful()) {
                    int count = 0;
                    ResKakaoBlog body = response.body();
                    Log.d("blog", body.toString());
                }

            }

            @Override
            public void onFailure(Call<ResKakaoBlog> call, Throwable t) {
                Log.d("Falied", call.toString());
            }
        });

        // 이미지 데이터리스트
        final Call<ResKakaoPhoto> call3 = kakaoService.getPhotoData();
        call3.enqueue(new Callback<ResKakaoPhoto>() {
            @Override
            public void onResponse(Call<ResKakaoPhoto> call, Response<ResKakaoPhoto> response) {

                if(response.isSuccessful()) {
                    int count = 0;
                    ResKakaoPhoto body = response.body();
                    Log.d("ResKakaoPhoto", body.toString());

                }

            }

            @Override
            public void onFailure(Call<ResKakaoPhoto> call, Throwable t) {
                Log.d("Falied", call.toString());
            }
        });

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_swipe_cafe, container, false);
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();

    }


}
