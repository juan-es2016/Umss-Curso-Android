package com.example.battl.appcomic.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.battl.appcomic.R;

/**
 * Created by Battl on 19/07/2017.
 */

public class ItemHeroes extends RecyclerView.ViewHolder {

    LinearLayout linearLayout;
    ImageView imgHeroe ;
    TextView txtNombre;
    TextView txtPoder;

    public ItemHeroes(View itemView) {
        super(itemView);

        linearLayout = (LinearLayout) itemView.findViewById(R.id.contenedor_item_heroes);
        imgHeroe = (ImageView) itemView.findViewById(R.id.img_heroe);
        txtNombre = (TextView) itemView.findViewById(R.id.txt_nombre);
        txtPoder = (TextView) itemView.findViewById(R.id.txt_poder);

    }

}
