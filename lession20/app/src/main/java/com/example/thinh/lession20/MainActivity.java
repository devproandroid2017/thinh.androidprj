package com.example.thinh.lession20;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    public static final  String PREFS_NAME = "DemSoLanVaoActivity";
    public static int dem=1;
    private TextView txt_1,txt_2;
    private EditText edt_1;
    private Button btn_luu,btn_hienthi;
    private StringBuffer string;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Restore preferences
        SharedPreferences settings = getSharedPreferences(PREFS_NAME,0);
        int start = settings.getInt("Dem",dem);
        txt_1 = (TextView) findViewById(R.id.txt_1);
        txt_1.setText(String.valueOf(start));
        txt_2 = (TextView) findViewById(R.id.txt_2);
        btn_luu = (Button) findViewById(R.id.btn_luu);
        btn_hienthi = (Button) findViewById(R.id.btn_hienthi);
        edt_1 = (EditText) findViewById(R.id.edt_1);

        btn_luu.setOnClickListener(ViewLuu);
        btn_hienthi.setOnClickListener(ViewHienThi);
    }

    public View.OnClickListener ViewLuu = new View.OnClickListener() {
        FileOutputStream fos = null;
        @Override
        public void onClick(View v) {
            String tenFile = "TuDaNhapVao";
            String kitu = String.valueOf(edt_1.getText());
            try {
                FileOutputStream fos = openFileOutput(tenFile, Context.MODE_PRIVATE);
                fos.write(kitu.getBytes());
            }catch (FileNotFoundException fnfe){
                Toast.makeText(MainActivity.this,"Khong tim thay file",Toast.LENGTH_LONG).show();
            }catch (IOException ioe){

            }finally {
                if(fos!=null) {
                    try{
                        fos.close();
                    }catch (IOException ioe){
                        Toast.makeText(MainActivity.this,"Bi loi IOException",Toast.LENGTH_LONG).show();
                    }

                }
            }
            Toast.makeText(MainActivity.this,"Da luu ki tu vao File",Toast.LENGTH_LONG).show();

        }
    };
    public View.OnClickListener ViewHienThi = new View.OnClickListener() {
        FileInputStream fis = null;
        @Override
        public void onClick(View v) {
            String tenFile = "TuDaNhapVao";
            string = new StringBuffer();
            try {
                fis = openFileInput(tenFile);
                byte a[]=new byte[1024];
                while(fis.read(a)>0){
                    String strTemp = new String(a);
                    string.append(strTemp);
                }
                txt_2.setText(string);
            }catch (FileNotFoundException fnfe){
                Toast.makeText(MainActivity.this,"Khong tim thay file",Toast.LENGTH_LONG).show();
            }catch (IOException ioe){

            }finally {
                if(fis!=null) {
                    try{
                        fis.close();
                    }catch (IOException ioe){
                        Toast.makeText(MainActivity.this,"Bi loi IOException",Toast.LENGTH_LONG).show();
                    }

                }
            }

        }
    };

    @Override
    protected void onStop() {
        super.onStop();
        // We need an Editor object to make preference changes.
        // All objects are from android.context.Context
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putInt("Dem",++dem);

        // Commit the edits!
        editor.commit();
    }
}
