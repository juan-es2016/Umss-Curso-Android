package com.example.battl.appcomic.Retrofit.Service;

import com.example.battl.appcomic.Retrofit.Models.Comic;
import com.example.battl.appcomic.Retrofit.Models.Creator;
import com.example.battl.appcomic.Retrofit.Models.Event;
import com.example.battl.appcomic.Retrofit.Models.Story;
import com.example.battl.appcomic.Retrofit.Response.ServiceResponse;

import java.util.Date;

import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface Series {

    @GET("/v1/public/series")
    public void listSeries(@Query("limit") int limit
            , @Query("offset") int offset
            , @Query("ts") String timestamp
            , @Query("apikey") String apikey
            , @Query("hash") String hashSignature
            , @Query("title") String title
            , @Query("modifiedSince") Date modified
            , @Query("comics") String comics
            , @Query("stories") String stories
            , @Query("events") String events
            , @Query("creators") String creators
            , @Query("characters") String characters
            , @Query("seriesType") String seriesType
            , @Query("contains") String contains
            , @Query("orderBy") String orderBy
            , Callback<ServiceResponse<com.example.battl.appcomic.Retrofit.Models.Series >> callback);

    @GET("/v1/public/series/{seriesId}")
    public void getSeriesWithId(@Path("seriesId") int seriesId
            , @Query("ts") String timestamp
            , @Query("apikey") String apikey
            , @Query("hash") String hashSignature
            , Callback<ServiceResponse<com.example.battl.appcomic.Retrofit.Models.Series>> callback);

    @GET("/v1/public/series/{seriesId}/characters")
    public void getCharactersForSeriesId(@Path("seriesId") int seriesId
            , @Query("limit") int limit
            , @Query("offset") int offset
            , @Query("ts") String timestamp
            , @Query("apikey") String apikey
            , @Query("hash") String hashSignature
            , @Query("name") String name
            , @Query("modifiedSince") Date modifiedSince
            , @Query("comics") String comics
            , @Query("events") String events
            , @Query("stories") String stories
            , @Query("orderBy") String orderBy
            , Callback<ServiceResponse<Character>> callback);

    @GET("/v1/public/series/{seriesId}/comics")
    public void getComicsForSeriesId(@Path("seriesId") int seriesId
            , @Query("limit") int limit
            , @Query("offset") int offset
            , @Query("ts") String timestamp
            , @Query("apikey") String apikey
            , @Query("hash") String hashSignature
            , @Query("format") String format
            , @Query("formatType") String formatType
            , @Query("noVariants") boolean noVariants
            , @Query("dateDescriptor") String dateDescriptor
            , @Query("dateRange") String dateRange
            , @Query("hasDigitalIssue") Boolean hasDigitalIssue
            , @Query("modifiedSince") Date modifiedSince
            , @Query("creators") String creators
            , @Query("characters") String characters
            , @Query("events") String events
            , @Query("stories") String stories
            , @Query("sharedAppearances") String sharedAppearances
            , @Query("collaborators") String collaborators
            , @Query("orderBy") String orderBy
            , Callback<ServiceResponse<Comic>> callback);

    @GET("/v1/public/series/{seriesId}/creators")
    public void getCreatorsForSeriesId(@Path("seriesId") int seriesId
            , @Query("limit") int limit
            , @Query("offset") int offset
            , @Query("ts") String timestamp
            , @Query("apikey") String apikey
            , @Query("hash") String hashSignature
            , @Query("firstName") String firstName
            , @Query("middleName") String middleName
            , @Query("lastName") String lastName
            , @Query("suffix") String suffix
            , @Query("modifiedSince") Date modifiedSince
            , @Query("comics") String comics
            , @Query("events") String events
            , @Query("stories") String stories
            , @Query("orderBy") String orderBy
            , Callback<ServiceResponse<Creator>> callback);

    @GET("/v1/public/series/{seriesId}/events")
    public void getEventsForSeriesId(@Path("seriesId") int seriesId
            , @Query("limit") int limit
            , @Query("offset") int offset
            , @Query("ts") String timestamp
            , @Query("apikey") String apikey
            , @Query("hash") String hashSignature
            , @Query("name") String name
            , @Query("modifiedSince") Date modifiedSince
            , @Query("comics") String comics
            , @Query("characters") String characters
            , @Query("creators") String creators
            , @Query("stories") String stories
            , @Query("orderBy") String orderBy
            , Callback<ServiceResponse<Event>> callback);

    @GET("/v1/public/series/{seriesId}/stories")
    public void getStoriesForEventId(@Path("seriesId") int seriesId
            , @Query("limit") int limit
            , @Query("offset") int offset
            , @Query("ts") String timestamp
            , @Query("apikey") String apikey
            , @Query("hash") String hashSignature
            , @Query("modifiedSince") Date modifiedSince
            , @Query("events") String events
            , @Query("comics") String comics
            , @Query("creator") String creators
            , @Query("characters") String characters
            , @Query("orderBy") String orderBy
            , Callback<ServiceResponse<Story>> callback);

}
