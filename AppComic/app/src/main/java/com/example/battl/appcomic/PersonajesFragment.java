package com.example.battl.appcomic;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.battl.appcomic.models.Heroe;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Battl on 20/07/2017.
 */

public class PersonajesFragment extends Fragment {

    @BindView(R.id.recycler_heroes)
    RecyclerView recyclerHeroes;
    Unbinder unbinder;
    AdapterHeroe adapterHeroe;

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup container, Bundle bundle) {
        View view = layoutInflater.inflate(R.layout.fragment_recycler_view, container, false);
        unbinder = ButterKnife.bind(this, view);

        adapterHeroe = new AdapterHeroe(createList());
        recyclerHeroes.setAdapter(adapterHeroe);
        recyclerHeroes.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        recyclerHeroes.getAdapter().notifyDataSetChanged();

        return view;
    }

    public List<Heroe> createList() {
        Heroe ironMan = new Heroe("IronMan", "Armadura Avanzada", getResources().getDrawable(R.drawable.iron_man));
        Heroe batman = new Heroe("batman", "Entrenamiento Avanzado", getResources().getDrawable(R.drawable.batman));
        Heroe superman = new Heroe("superman", "Super Fuerza", getResources().getDrawable(R.drawable.superman));
        Heroe capitan = new Heroe("capitan", "Mejora genetica", getResources().getDrawable(R.drawable.capitan_america));
        Heroe joker = new Heroe("joker", "ninguno", getResources().getDrawable(R.drawable.joker));

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

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
