package com.example.battl.appcomic.Retrofit.Models;

import java.util.Date;
import java.util.List;

/**
 * Created by Battl on 25/07/2017.
 */
public class Creator {

    public int id;
    public String firstName;
    public String middleName;
    public String lastName;
    public String suffix;
    public String fullName;
    public Date modified;
    public ImageInfo thumbnail;
    public String resourceURI;
    public ItemList comics;
    public ItemList series;
    public ItemList stories;
    public ItemList events;
    public List<Url> urls;


}
