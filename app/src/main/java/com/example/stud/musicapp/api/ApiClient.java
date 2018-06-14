package com.example.stud.musicapp.api;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by W57002 on 2018-04-19.
 */
public interface ApiClient {

    @GET( "trending.php" )
    Call<TrendingList> getTrendingList(@Query( "country" ) String country, @Query ( "type" )
            String type, @Query ( "format" ) String format);
    @GET ( "track.php" )
    Call<Tracks> getTrack(@Query("h") int trackId);
}
