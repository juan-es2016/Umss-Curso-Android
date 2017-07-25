package com.example.battl.appcomic.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.battl.appcomic.R;
import com.example.battl.appcomic.Models.Heroe;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Battl on 20/07/2017.
 */

public class PersonajeFragment extends Fragment {


    @BindView(R.id.img_heroe)
    ImageView imgHeroe;
    @BindView(R.id.txt_name)
    TextView txtName;
    @BindView(R.id.txt_poder)
    TextView txtPoder;
    Unbinder unbinder;

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup container, Bundle bundle) {
        View view = layoutInflater.inflate(R.layout.fragment_heroe, container, false);
        unbinder = ButterKnife.bind(this, view);
        Heroe joker = new Heroe("joker", "ninguno", getResources().getDrawable(R.drawable.joker));
        cargarHeroes(joker);
        return view;
    }

    public void cargarHeroes(Heroe heroe){
        imgHeroe.setBackground(heroe.getImage());
        txtName.setText(heroe.getNombre());
        txtPoder.setText(heroe.getPoder());
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
