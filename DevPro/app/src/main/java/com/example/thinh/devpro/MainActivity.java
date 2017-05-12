package com.example.thinh.devpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnCaiDat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCaiDat =(Button)findViewById(R.id.btnCaiDat);
        btnCaiDat.setOnClickListener(CaiDat);
    }

    private View.OnClickListener CaiDat = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this,SettingActivity.class);
            MainActivity.this.startActivity(intent);
        }
    };



}
