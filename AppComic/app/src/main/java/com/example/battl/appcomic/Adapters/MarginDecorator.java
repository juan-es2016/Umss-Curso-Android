package com.example.battl.appcomic.Adapters;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.battl.appcomic.R;

/**
 * Created by Brian on 09/06/2016.
 */
public class MarginDecorator extends RecyclerView.ItemDecoration {
    private int margin;

    public MarginDecorator(Context context) {
        margin = context.getResources().getDimensionPixelSize(R.dimen.item_margin);
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        outRect.set(margin, margin, margin, margin);
    }
}
