package com.example.thinh.lession16;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Thinh on 6/2/2017.
 */

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.RecyclerViewHolder>{
    private ArrayList<Item> listItem;
    private LayoutInflater inflater;

    public ItemAdapter(ArrayList<Item> listItem, LayoutInflater inflater) {
        this.listItem = listItem;
        this.inflater = inflater;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        inflater = LayoutInflater.from(parent.getContext());
        View itemview = inflater.inflate(R.layout.item_recyclerview,parent,false);
        return new RecyclerViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.textView.setText(listItem.get(position).getText());
        holder.imageView.setImageResource(listItem.get(position).getImit());
    }

    @Override
    public int getItemCount() {
        return listItem.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public RecyclerViewHolder(View v){
            super(v);
            imageView = (ImageView) v.findViewById(R.id.imageView);
            textView = (TextView) v.findViewById(R.id.textView);
        }
    }
}
