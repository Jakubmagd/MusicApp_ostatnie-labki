package com.example.stud.musicapp.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by W57002 on 2018-04-19.
 */

public class ApiService {

        public static ApiClient getService(){
            Retrofit retrofit=new Retrofit.Builder()
                    .baseUrl("http://www.theaudiodb.com/api/v1/json/1/")
                    .addConverterFactory(GsonConverterFactory. create ())
                    .build();
            return retrofit.create(ApiClient.class);
        }


}

