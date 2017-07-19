package com.example.battl.appcomic.models;

import android.graphics.drawable.Drawable;
import android.media.Image;

/**
 * Created by Battl on 19/07/2017.
 */

public class Heroe {

    String nombre;
    String poder;
    Drawable image;

    public Heroe(String nombre, String poder, Drawable image) {
        this.nombre = nombre;
        this.poder = poder;
        this.image = image;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }
}
