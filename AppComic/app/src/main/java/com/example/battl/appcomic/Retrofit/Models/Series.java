package com.example.battl.appcomic.Retrofit.Models;

import java.util.Date;
import java.util.List;

/**
 * Created by Battl on 25/07/2017.
 */
public class Series {

    public int id;
    public String title;
    public String description;
    public String resourceURI;
    public List<Url> urls;
    public int startYear;
    public int endYear;
    public String rating;
    public Date modified;
    public ImageInfo thumbnail;
    public ItemList comics;
    public ItemList stories;
    public ItemList events;
    public CharacterList characters;
    public CreatorList creators;
    public Item next;
    public Item previous;
}
