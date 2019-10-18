package com.sumit.cityshow_nodejs.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.sumit.cityshow_nodejs.R;
import com.sumit.cityshow_nodejs.model.CityModel;

import java.util.ArrayList;

public class CustomeCityAdapter extends ArrayAdapter<CityModel> {

    private Context context;
    ArrayList<CityModel> arrayList;

    public CustomeCityAdapter(@NonNull Context context, ArrayList<CityModel> arrayList) {
        super(context, 0, arrayList);
        this.context = context;
        this.arrayList = arrayList;

    }
//ok

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_listview, parent,false);
            // View rowView=inflater.inflate(R.layout.activity_listview, null,true);
            TextView titleText = (TextView) convertView.findViewById(R.id.label);


            titleText.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

            CityModel cityModel = (CityModel) arrayList.get(position);

            titleText.setText(cityModel.getCity_name());
        }
        return convertView;
    }
}
