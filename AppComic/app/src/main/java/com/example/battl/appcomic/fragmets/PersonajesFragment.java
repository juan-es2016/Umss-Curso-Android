package com.example.battl.appcomic.fragmets;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.battl.appcomic.R;
import com.example.battl.appcomic.Utils.HeroeUtil;
import com.example.battl.appcomic.activities.VsActivity;
import com.example.battl.appcomic.adapter.AdapterHeroe;
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

        adapterHeroe = new AdapterHeroe(new HeroeUtil().createList(getActivity()));
        recyclerHeroes.setAdapter(adapterHeroe);
        recyclerHeroes.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        recyclerHeroes.getAdapter().notifyDataSetChanged();
        return view;
    }

    public void clickHeroe(){
       // ((VsActivity)getActivity()).setHeroeFragmentDos();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
