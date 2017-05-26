package com.example.thinh.lession15;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{
    private GridView lvBaiTap;
//    private ListView lvBaiTap;
    private ArrayList<Item> item;
    private ItemAdapter IA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvBaiTap = (GridView) findViewById(R.id.lvBaiTap);
//        lvBaiTap = (ListView) findViewById(R.id.lvBaiTap);
        item = getDataItem();
        IA =  new ItemAdapter(item, getLayoutInflater());
        lvBaiTap.setAdapter(IA);
        addEvent();

    }

    private void addEvent() {
        AdapterView.OnItemClickListener onClick = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                 Item item1 = item.get(position);
                 Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                 intent.putExtra("image",item1.getImit());
                 intent.putExtra("name",item1.getName());
                startActivity(intent);
            }
        };
        lvBaiTap.setOnItemClickListener(onClick);
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
