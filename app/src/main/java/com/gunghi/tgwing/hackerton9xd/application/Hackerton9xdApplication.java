package com.gunghi.tgwing.hackerton9xd.application;

import android.app.Application;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by joyeongje on 2017. 9. 9..
 */

public class Hackerton9xdApplication extends Application {

    private static volatile Hackerton9xdApplication mInstance = null;

    private static Retrofit retrofit = null;
    private static Retrofit retrofit2 = null;
    private static final String BASE_URL = "http://p.winterj.me:9090";
    private static final String DAUM_API_URL = "https://dapi.kakao.com";


    public static Hackerton9xdApplication getGlobalApplicationContext() {
        if (mInstance == null)
            throw new IllegalStateException("this application does not inherit HawkiApplication");
        return mInstance;
    }

    public static Retrofit getRetrofit() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(DAUM_API_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }

    public static Retrofit getRetrofitByServer() {

        if (retrofit2 == null) {
            retrofit2 = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit2;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;

    }

    @Override
    public void onTerminate() {
        mInstance = null;
        super.onTerminate();
    }

}
