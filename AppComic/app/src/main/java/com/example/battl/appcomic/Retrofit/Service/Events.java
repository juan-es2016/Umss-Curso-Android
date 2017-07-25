package com.example.battl.appcomic.Retrofit.Service;

import com.example.battl.appcomic.Retrofit.Models.*;
import com.example.battl.appcomic.Retrofit.Models.Character;
import com.example.battl.appcomic.Retrofit.Models.Series;
import com.example.battl.appcomic.Retrofit.Response.ServiceResponse;

import java.util.Date;

import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface Events {

    @GET("/v1/public/events")
    public void listEvents(@Query("limit") int limit
            , @Query("offset") int offset
            , @Query("ts") String timestamp
            , @Query("apikey") String apikey
            , @Query("hash") String hashSignature
            , @Query("name") String name
            , @Query("modifiedSince") Date modifiedSince
            , @Query("creator") String creators
            , @Query("series") String series
            , @Query("comics") String comics
            , @Query("stories") String stories
            , @Query("characters") String characters
            , @Query("orderBy") String orderBy
            , Callback<ServiceResponse<Event>> callback);

    @GET("/v1/public/events/{eventId}")
    public void getEventWithId(@Path("eventId") int eventId
            , @Query("ts") String timestamp
            , @Query("apikey") String apikey
            , @Query("hash") String hashSignature
            , Callback<ServiceResponse<Event>> callback);

    @GET("/v1/public/events/{eventId}/characters")
    public void getCharactersForEventId(@Path("eventId") int eventId
            , @Query("limit") int limit
            , @Query("offset") int offset
            , @Query("ts") String timestamp
            , @Query("apikey") String apikey
            , @Query("hash") String hashSignature
            , @Query("name") String name
            , @Query("modifiedSince") Date modifiedSince
            , @Query("series") String series
            , @Query("comics") String comics
            , @Query("stories") String stories
            , @Query("orderBy") String orderBy
            , Callback<ServiceResponse<Character>> callback);


    @GET("/v1/public/events/{eventId}/comics")
    public void getComicsForEventId(@Path("eventId") int eventId
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
            , @Query("series") String series
            , @Query("stories") String stories
            , @Query("sharedAppearances") String sharedAppearances
            , @Query("collaborators") String collaborators
            , @Query("orderBy") String orderBy
            , Callback<ServiceResponse<Comic>> callback);

    @GET("/v1/public/events/{eventId}/creators")
    public void getCreatorsForEventId(@Path("eventId") int eventId
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
            , @Query("series") String series
            , @Query("stories") String stories
            , @Query("orderBy") String orderBy
            , Callback<ServiceResponse<Creator>> callback);

    @GET("/v1/public/events/{eventId}/series")
    public void getSeriesForEventId(@Path("eventId") int eventId
            , @Query("limit") int limit
            , @Query("offset") int offset
            , @Query("ts") String timestamp
            , @Query("apikey") String apikey
            , @Query("hash") String hashSignature
            , @Query("title") String title
            , @Query("modifiedSince") Date modified
            , @Query("comics") String comics
            , @Query("stories") String stories
            , @Query("characters") String characters
            , @Query("creators") String creators
            , @Query("seriesType") String seriesType
            , @Query("contains") String contains
            , @Query("orderBy") String orderBy
            , Callback<ServiceResponse<Series>> callback);

    @GET("/v1/public/events/{eventId}/stories")
    public void getStoriesForEventId(@Path("eventId") int eventId
            , @Query("limit") int limit
            , @Query("offset") int offset
            , @Query("ts") String timestamp
            , @Query("apikey") String apikey
            , @Query("hash") String hashSignature
            , @Query("modifiedSince") Date modifiedSince
            , @Query("series") String series
            , @Query("comics") String comics
            , @Query("creator") String creators
            , @Query("characters") String characters
            , @Query("orderBy") String orderBy
            , Callback<ServiceResponse<Story>> callback);
}
