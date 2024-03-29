package com.sumit.cityshow_nodejs.model;

import com.google.gson.annotations.SerializedName;

public class CityModel {

    @SerializedName("city_id")
    private String city_id;

    @SerializedName("city_name")
    private String city_name;

    public CityModel(String city_id, String city_name)
    {
        this.city_id = city_id;
        this.city_name = city_name;
    }

    public String getCity_id() {
        return city_id;
    }

    public void setCity_id(String city_id) {
        this.city_id = city_id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }
}
