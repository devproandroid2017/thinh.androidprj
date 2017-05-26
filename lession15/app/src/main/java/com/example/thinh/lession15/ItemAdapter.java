package com.example.thinh.lession15;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Thinh on 5/26/2017.
 */

public class ItemAdapter extends BaseAdapter{
    private ArrayList<Item> listdata;
    private LayoutInflater inflater;

    private ImageView imgItem;
    private TextView tvName, tvType;
    private CheckBox cbBoolean;

    public ItemAdapter(ArrayList<Item> listdata, LayoutInflater inflater) {
        this.listdata = listdata;
        this.inflater = inflater;
    }

    @Override
    public int getCount() {
        return listdata.size();
    }

    @Override
    public Object getItem(int position) {
        return listdata.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Item item = listdata.get(position);

        if(convertView == null){
            convertView = inflater.inflate(R.layout.test,null);
        }
        imgItem = (ImageView) convertView.findViewById(R.id.imgItem);
        tvName= (TextView) convertView.findViewById(R.id.tvName);
        tvType = (TextView) convertView.findViewById(R.id.tvType);
        cbBoolean = (CheckBox) convertView.findViewById(R.id.cbBoolean);

        imgItem.setImageResource(item.getImit());
        tvName.setText(item.getName()+": "+String.valueOf(item.getPercent())+"%");
        tvType.setText(item.getType());
        cbBoolean.setChecked(item.getCheck());

        return convertView;
    }
}
