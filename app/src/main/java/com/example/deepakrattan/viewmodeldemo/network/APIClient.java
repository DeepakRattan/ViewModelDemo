package com.example.deepakrattan.viewmodeldemo.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;



public class APIClient {


    //Also i want to use the API "http://resourcemanage.sfsd.sebizfinishingschool.com/API/AccountAPI/GetLoginUser"
    //to post the json data
    public static final String BASE_URL_Resource_Management = "http://resourcemanage.sfsd.sebizfinishingschool.com/API/";
    private static Retrofit retrofit;

    //This method will provide the Retrofit instance
    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL_Resource_Management)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }
        return retrofit;
    }
}
