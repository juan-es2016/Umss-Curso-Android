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

public interface Comics {

    @GET("/v1/public/comics")
    public void listComics(@Query("limit") int limit
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
            , @Query("series") String series
            , @Query("events") String events
            , @Query("stories") String stories
            , @Query("sharedAppearances") String sharedAppearances
            , @Query("collaborators") String collaborators
            , @Query("orderBy") String orderBy
            , Callback<ServiceResponse<Comic>> callback);

    @GET("/v1/public/comics/{comicId}")
    public void getComicWithId(@Path("comicId") int comicId
            , @Query("ts") String timestamp
            , @Query("apikey") String apikey
            , @Query("hash") String hashSignature
            , Callback<ServiceResponse<Comic>> callback);

    @GET("/v1/public/comics/{comicId}/characters")
    public void getCharactersForComicId(@Path("comicId") int comicId
            , @Query("limit") int limit
            , @Query("offset") int offset
            , @Query("ts") String timestamp
            , @Query("apikey") String apikey
            , @Query("hash") String hashSignature
            , @Query("name") String name
            , @Query("modifiedSince") Date modifiedSince
            , @Query("series") String series
            , @Query("events") String events
            , @Query("stories") String stories
            , @Query("orderBy") String orderBy
            , Callback<ServiceResponse<Character>> callback);

    @GET("/v1/public/comics/{comicId}/creators")
    public void getCreatorsForComicId(@Path("comicId") int comicId
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

    @GET("/v1/public/comics/{comicId}/events")
    public void getEventsForComicId(@Path("comicId") int comicId
            , @Query("limit") int limit
            , @Query("offset") int offset
            , @Query("ts") String timestamp
            , @Query("apikey") String apikey
            , @Query("hash") String hashSignature
            , @Query("name") String name
            , @Query("modifiedSince") Date modifiedSince
            , @Query("creator") String creators
            , @Query("characters") String characters
            , @Query("series") String series
            , @Query("stories") String stories
            , @Query("orderBy") String orderBy
            , Callback<ServiceResponse<Event>> callback);


    @GET("/v1/public/comics/{comicId}/stories")
    public void getStoriesForComicId(@Path("comicId") int comicId
            , @Query("limit") int limit
            , @Query("offset") int offset
            , @Query("ts") String timestamp
            , @Query("apikey") String apikey
            , @Query("hash") String hashSignature
            , @Query("modifiedSince") Date modifiedSince
            , @Query("series") String series
            , @Query("events") String events
            , @Query("creator") String creators
            , @Query("characters") String characters
            , @Query("orderBy") String orderBy
            , Callback<ServiceResponse<Story>> callback);



}
