package com.sumit.cityshow_nodejs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.sumit.cityshow_nodejs.adapter.CustomeCityAdapter;
import com.sumit.cityshow_nodejs.model.CityModel;
import com.sumit.cityshow_nodejs.webapi.APIClient;
import com.sumit.cityshow_nodejs.webapi.APIInterface;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    APIInterface apiInterface;
    ArrayList<CityModel> cityModels;
    ListView list;
    String[] mobileArray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cityModels = new ArrayList<>();
        getCity();
    }

    private void getCity()
    {
        apiInterface= APIClient.getClientForObjects().create(APIInterface.class);
        Call<ArrayList<CityModel>> call=apiInterface.getCity();
        call.enqueue(new Callback<ArrayList<CityModel>>() {
            @Override
            public void onResponse(Call<ArrayList<CityModel>> call, Response<ArrayList<CityModel>> response) {
                cityModels = response.body();
                CustomeCityAdapter customeCityAdapter = new CustomeCityAdapter(getApplicationContext(), cityModels);
                list=(ListView)findViewById(R.id.city_list);
                list.setAdapter(customeCityAdapter);
            }

            @Override
            public void onFailure(Call<ArrayList<CityModel>> call, Throwable t) {

            }
        });
    }
}
