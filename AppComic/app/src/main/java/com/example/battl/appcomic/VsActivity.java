package com.example.battl.appcomic;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Battl on 20/07/2017.
 */

public class VsActivity extends AppCompatActivity {

    @BindView(R.id.contenedor_fragment_uno)
    FrameLayout contenedorFragmentUno;
    @BindView(R.id.contenedor_fragment_dos)
    FrameLayout contenedorFragment2;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_vs);
        ButterKnife.bind(this);
        PersonajesFragment personajesFragment = new PersonajesFragment();
        loadFragment(personajesFragment);
        PersonajeFragment personajeFragment = new PersonajeFragment();
        loadFragment2(personajeFragment);
    }

    public void loadFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.contenedor_fragment_uno, fragment);
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        fragmentTransaction.commit();
    }

    public void loadFragment2(Fragment fragment){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.contenedor_fragment_dos, fragment);
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        fragmentTransaction.commit();
    }

}
