package com.sumit.cityshow_nodejs.webapi;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIClient {
    private static final String BASE_URL = "http://192.168.13.101:5000";
    private static Retrofit retrofit = null;


    static Gson gson = new GsonBuilder()
            .setLenient()
            .create();

    public static Retrofit getClientForObjects() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
        }
        return retrofit;
    }
}
