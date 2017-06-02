package com.example.thinh.lession16;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ItemAdapter itemAdapter;
    private ArrayList<Item> listItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewList);
        listItem = getdataitem();
        itemAdapter = new ItemAdapter(listItem, getLayoutInflater());
        recyclerView.setAdapter(itemAdapter);
        recyclerView.setLayoutManager(layoutManager);


    }

    private ArrayList<Item> getdataitem(){
        ArrayList<Item> lsItem = new ArrayList<>();
        lsItem.add(new Item(R.drawable.img1,"anh 1"));
        lsItem.add(new Item(R.drawable.img2,"anh 2"));
        lsItem.add(new Item(R.drawable.img3,"anh 3"));
        lsItem.add(new Item(R.drawable.img4,"anh 4"));
        lsItem.add(new Item(R.drawable.img5,"anh 5"));
        lsItem.add(new Item(R.drawable.img6,"anh 6"));
        lsItem.add(new Item(R.drawable.img7,"anh 7"));
        lsItem.add(new Item(R.drawable.img8,"anh 8"));
        return lsItem;
    }
}
