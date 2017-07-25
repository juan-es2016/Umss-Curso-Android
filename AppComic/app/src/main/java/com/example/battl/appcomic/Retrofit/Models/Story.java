package com.example.battl.appcomic.Retrofit.Models;

import java.util.Date;

/**
 * Created by Battl on 25/07/2017.
 */
public class Story {

    public int id;
    public String title;
    public String description;
    public String resourceURI;
    public String type;
    public Date modified;
    public ImageInfo thumbnail;
    public ItemList comics;
    public SeriesList series;
    public CharacterList characters;
    public CreatorList creators;
    public Item originalIssue;

}
