package com.example.battl.appcomic.Utils;

import android.app.Activity;

import com.example.battl.appcomic.R;
import com.example.battl.appcomic.models.Heroe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Battl on 21/07/2017.
 */

public class HeroeUtil {

    public List<Heroe> createList(Activity activity) {
        Heroe ironMan = new Heroe("IronMan", "Armadura Avanzada", activity.getResources().getDrawable(R.drawable.iron_man));
        Heroe batman = new Heroe("batman", "Entrenamiento Avanzado", activity.getResources().getDrawable(R.drawable.batman));
        Heroe superman = new Heroe("superman", "Super Fuerza", activity.getResources().getDrawable(R.drawable.superman));
        Heroe capitan = new Heroe("capitan", "Mejora genetica", activity.getResources().getDrawable(R.drawable.capitan_america));
        Heroe joker = new Heroe("joker", "ninguno", activity.getResources().getDrawable(R.drawable.joker));

        List<Heroe> heroeList = new ArrayList<>();
        heroeList.add(ironMan);
        heroeList.add(batman);
        heroeList.add(superman);
        heroeList.add(capitan);
        heroeList.add(joker);
        heroeList.add(ironMan);
        heroeList.add(batman);
        heroeList.add(superman);
        heroeList.add(capitan);
        heroeList.add(joker);
        heroeList.add(ironMan);
        heroeList.add(batman);
        heroeList.add(superman);
        heroeList.add(joker);
        return heroeList;
    }

}
