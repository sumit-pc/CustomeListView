package com.sumit.cityshow_nodejs.webapi;

import com.sumit.cityshow_nodejs.model.CityModel;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIInterface {

    @POST("/city")
    Call<ArrayList<CityModel>> getCity();
}
