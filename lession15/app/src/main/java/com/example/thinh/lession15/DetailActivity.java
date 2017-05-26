package com.example.thinh.lession15;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
     private TextView txtType;
    private ImageView imgItem1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_acticity);
         txtType = (TextView) findViewById(R.id.txtType);
         imgItem1 = (ImageView) findViewById(R.id.imgItem1);
        Intent intent = getIntent();
        int image = intent.getExtras().getInt("image");
        String name = intent.getExtras().getString("name");
        txtType.setText(name);
        imgItem1.setImageResource(image);
    }
}
