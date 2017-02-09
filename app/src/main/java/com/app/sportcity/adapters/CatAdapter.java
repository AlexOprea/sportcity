package com.app.sportcity.adapters;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.sportcity.R;
import com.app.sportcity.objects.CategorySer;
import com.app.sportcity.utils.Opener;
import com.app.sportcity.view_holder.CategoryViewHolder;

import java.util.ArrayList;

/**
 * Created by bugatti on 18/11/16.
 */

public class CatAdapter extends RecyclerView.Adapter<CategoryViewHolder> {

    ArrayList<CategorySer> categories = new ArrayList<>();
    Context mContext;

    public CatAdapter(ArrayList<CategorySer> categories, Context mContext) {
        this.categories = categories;
        this.mContext = mContext;
    }

    @Override
    public CategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_cats, null, false);
//        CategoryViewHolder categoryViewHolder = new CategoryViewHolder(parent);
        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CategoryViewHolder holder, int position) {

        final CategorySer categorySer = categories.get(position);
        holder.tvCatTitle.setText(categorySer.getCatTitle());
        holder.tvCatTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Opener.CategoryNewsListing((Activity) mContext, categorySer);
            }
        });

    }

    @Override
    public int getItemCount() {
        return categories.size();
    }
}
