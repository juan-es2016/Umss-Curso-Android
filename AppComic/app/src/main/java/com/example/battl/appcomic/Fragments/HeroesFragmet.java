package com.example.battl.appcomic.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.battl.appcomic.R;

/**
 * Created by Battl on 24/07/2017.
 */

public class HeroesFragmet extends Fragment {

    LinearLayout linearLayout1;
    LinearLayout linearLayout2;
    LinearLayout linearLayout3;
    LinearLayout linearLayout4;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle){
        View view = inflater.inflate(R.layout.heroes_activity, container, false);
        linearLayout1 = (LinearLayout) view.findViewById(R.id.linearLayout1);
        linearLayout2 = (LinearLayout) view.findViewById(R.id.linearLayout2);
        linearLayout3 = (LinearLayout) view.findViewById(R.id.linearLayout3);
        linearLayout4 = (LinearLayout) view.findViewById(R.id.linearLayout4);


        return view;
    }

}
