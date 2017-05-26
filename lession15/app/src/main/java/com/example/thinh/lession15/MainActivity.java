package com.example.thinh.lession15;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{
    private ListView lvBaiTap;
    private ArrayList<Item> item;
    private ItemAdapter IA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvBaiTap = (ListView) findViewById(R.id.lvBaiTap);
        item = getDataItem();
        IA =  new ItemAdapter(item, getLayoutInflater());
        lvBaiTap.setAdapter(IA);

    }

    private ArrayList<Item> getDataItem(){
        ArrayList<Item> lsItem = new ArrayList<>();
        //int imit, String name, int percent, String type, Boolean check
        lsItem.add(new Item(R.drawable.img1,"Calendar CPU",0,"System",false));
        lsItem.add(new Item(R.drawable.img2,"Contacs CPU",0,"System",false));
        lsItem.add(new Item(R.drawable.img3,"Facebook CPU",28,"Background",false));
        lsItem.add(new Item(R.drawable.img4,"Twitter CPU",0,"Background",false));
        lsItem.add(new Item(R.drawable.img5,"Messagin CPU",0,"System",false));
        lsItem.add(new Item(R.drawable.img6,"Dictionary Provider CPU",0,"System",false));
        lsItem.add(new Item(R.drawable.img7,"MusicFX CPU",0,"System",false));
        lsItem.add(new Item(R.drawable.img8,"Nfc Service CPU",0,"System",false));
        return lsItem;
    }
}
