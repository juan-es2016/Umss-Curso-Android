package com.example.battl.appcomic.Retrofit.Response;
/**
 * Created by Battl on 25/07/2017.
 */
public class ServiceResponse<E>{
    public int code;
    public String status;
    public String etag;
    public DataContainer<E> data;

}
