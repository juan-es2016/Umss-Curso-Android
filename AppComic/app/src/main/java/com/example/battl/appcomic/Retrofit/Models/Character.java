package com.example.battl.appcomic.Retrofit.Models;

import java.util.Date;
import java.util.List;

/**
 * Created by Battl on 25/07/2017.
 */
public class Character {

    public int id;
    public String name;
    public String description;
    public Date modified;
    public String resourceURI;
    public List<Url> urls;
    public ImageInfo thumbnail;
    public ItemList comics;
    public ItemList stories;
    public ItemList events;
    public ItemList series;

}
