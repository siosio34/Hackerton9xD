package com.gunghi.tgwing.hackerton9xd.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.daimajia.slider.library.SliderLayout;
import com.gunghi.tgwing.hackerton9xd.R;
import com.gunghi.tgwing.hackerton9xd.application.Hackerton9xdApplication;
import com.gunghi.tgwing.hackerton9xd.network.response.ResKakaoBasicInfo;
import com.gunghi.tgwing.hackerton9xd.network.response.ResKakaoBlog;
import com.gunghi.tgwing.hackerton9xd.network.response.ResKakaoLocalAPI;
import com.gunghi.tgwing.hackerton9xd.network.response.ResKakaoPhoto;
import com.gunghi.tgwing.hackerton9xd.network.service.KakaoService;
import com.gunghi.tgwing.hackerton9xd.util.LocationTracker;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;


public class SwipeCafeFragment extends Fragment{

    private ArrayList<String> idList = new ArrayList<>();
    private SliderLayout mDemoSlider;
    private View rootView;

    public SwipeCafeFragment() {

        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        getLocaleIdList();


//        //idList = getLocaleIdList();

//        Retrofit retrofit =  Hackerton9xdApplication.getRetrofitByServer();
//        KakaoService kakaoService = retrofit.create(KakaoService.class);
//
//        // 베이식 인포
//        final Call<ResKakaoBasicInfo> call = kakaoService.getBasicInfoData(idList.get(0));
//        call.enqueue(new Callback<ResKakaoBasicInfo>() {
//            @Override
//            public void onResponse(Call<ResKakaoBasicInfo> call, Response<ResKakaoBasicInfo> response) {
//
//                if(response.isSuccessful()) {
//                    int count = 0;
//                    ResKakaoBasicInfo body = response.body();
//                    Log.d("ResKakaoBasicInfo", body.toString());
//
//                }
//
//            }
//
//            @Override
//            public void onFailure(Call<ResKakaoBasicInfo> call, Throwable t) {
//                Log.d("Falied", call.toString());
//            }
//        });
//
//        // 블로그
//        final Call<ResKakaoBlog> call2 = kakaoService.getBlogData(idList.get(0));
//        call2.enqueue(new Callback<ResKakaoBlog>() {
//            @Override
//            public void onResponse(Call<ResKakaoBlog> call, Response<ResKakaoBlog> response) {
//
//                if(response.isSuccessful()) {
//                    int count = 0;
//                    ResKakaoBlog body = response.body();
//                    Log.d("blog", body.toString());
//                }
//
//            }
//
//            @Override
//            public void onFailure(Call<ResKakaoBlog> call, Throwable t) {
//                Log.d("Falied", call.toString());
//            }
//        });
//
//        // 이미지 데이터리스트
//        final Call<ResKakaoPhoto> call3 = kakaoService.getPhotoData(idList.get(0));
//        call3.enqueue(new Callback<ResKakaoPhoto>() {
//            @Override
//            public void onResponse(Call<ResKakaoPhoto> call, Response<ResKakaoPhoto> response) {
//
//                if(response.isSuccessful()) {
//                    int count = 0;
//                    ResKakaoPhoto body = response.body();
//                    Log.d("ResKakaoPhoto", body.toString());
//
//                }
//
//            }
//
//            @Override
//            public void onFailure(Call<ResKakaoPhoto> call, Throwable t) {
//                Log.d("Falied", call.toString());
//            }
//        });

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        rootView = inflater.inflate(R.layout.fragment_swipe_cafe, container, false);
        mDemoSlider = (SliderLayout)rootView.findViewById(R.id.slider);
        // Inflate the layout for this fragment
        return rootView;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();

    }


    public void getLocaleIdList() {

        Retrofit daumRetrofit = Hackerton9xdApplication.getRetrofit();
        KakaoService kakaoAPIService = daumRetrofit.create(KakaoService.class);

        String x = LocationTracker.getCurLoc().getLatitude() +"";
        String y = LocationTracker.getCurLoc().getLongitude() +"";

        int radius = 10000;
        final Call<ResKakaoLocalAPI> call = kakaoAPIService.getCafeList("KakaoAK 1d6e137a6cc075f1f2c2af376a15fc2b","CE7", y, x, radius);
        call.enqueue(new Callback<ResKakaoLocalAPI>() {
            @Override
            public void onResponse(Call<ResKakaoLocalAPI> call, Response<ResKakaoLocalAPI> response) {
                Log.d("call", call.toString());
                Log.d("response", response.toString());

                if(response.isSuccessful()) {
                    for (ResKakaoLocalAPI.Document item : response.body().getDocuments()) {
                        String []url = item.getPlaceUrl().split("/");
                        int len = url.length;
                        idList.add(url[len-1]);
                    }
                    getDetailedLocalData(0);
                }
            }

            @Override
            public void onFailure(Call<ResKakaoLocalAPI> call, Throwable t) {
                Log.d("failed",idList.toString());
            }
        });
    }

    private void getDetailedLocalData(int index) {
        Retrofit retrofit =  Hackerton9xdApplication.getRetrofitByServer();
        KakaoService kakaoService = retrofit.create(KakaoService.class);


        final Call<ResKakaoBasicInfo> call = kakaoService.getBasicInfoData(idList.get(0));
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
        final Call<ResKakaoBlog> call2 = kakaoService.getBlogData(idList.get(index));
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
        final Call<ResKakaoPhoto> call3 = kakaoService.getPhotoData(idList.get(index));
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


}
