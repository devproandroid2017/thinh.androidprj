package com.example.thinh.devpro;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class SettingActivity extends AppCompatActivity {
    TextView txtTitle;
    Button btnDongY;
    Switch swtLanguae;
    CheckBox checkboxAutoStart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        txtTitle =(TextView)findViewById(R.id.tvTitle);
        swtLanguae = (Switch)findViewById(R.id.swtLanguage);
        checkboxAutoStart =(CheckBox) findViewById(R.id.checkboxAutoStart);
        btnDongY = (Button)findViewById(R.id.btnDongY);
        btnDongY.setOnClickListener(DongY);
    }
    private View.OnClickListener DongY = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            //change language
            if(checkboxAutoStart.isChecked()) {
                Locale locale = Locale.ENGLISH;
                Configuration overriderConfiguration = getBaseContext().getResources().getConfiguration();
                if (swtLanguae.isChecked()) {
                    locale = Locale.ENGLISH;
                } else {
                    locale = new Locale("vi_VN");
                }

                //switch to main screen
                overriderConfiguration.setLocale(locale);
                getApplicationContext().createConfigurationContext(overriderConfiguration);
                Intent intent = new Intent(SettingActivity.this, MainActivity.class);
                SettingActivity.this.startActivity(intent);
            }else {
                Toast.makeText(SettingActivity.this, "Ban chua click", Toast.LENGTH_SHORT).show();
            }
        }
    };
}
