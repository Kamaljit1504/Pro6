package com.example.pro6;

import android.icu.text.Transliterator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewDemoAdapter extends RecyclerView.Adapter<RecyclerViewDemoAdapter.ViewHolder>

{
    private List<Country> countryList;

    public RecyclerViewDemoAdapter(List<Country> countryList)
    {
        this.countryList = countryList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.demo_row,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        Country country = countryList.get(position);
        holder.title.setText(country.getTitle());
        holder.imgFlag.setImageResource(country.getFlag());

    }

    @Override
    public int getItemCount() {
        //00return 0;
        return countryList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView imgFlag;
        TextView title;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFlag=itemView.findViewById(R.id.imgView);
            title=itemView.findViewById(R.id.txtView);
        }
    }

}
