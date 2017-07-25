package com.example.battl.appcomic.Retrofit.Response;

import java.util.List;

/**
 * Created by Battl on 25/07/2017.
 */
public class DataContainer <E> {

    public int offset;
    public int limit;
    public int total;
    public int count;
    public List<E> results;

}
