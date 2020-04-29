package com.sundar.programming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class PlgDashActivity extends AppCompatActivity {

    private static final String  TAG = "PlgDashActivity";
    private   Button BtnJava,  BtnAndroid,    BtnHTML,   IOS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plg_dash);

        initViews();
    }

    private void initViews() {

        Log.d(TAG,"initt: Starts");
        BtnJava = (Button) findViewById(R.id.BtnJava);
        BtnAndroid = (Button) findViewById(R.id.BtnAndroid);
        BtnHTML = (Button) findViewById(R.id.BtnHTML);
        IOS = (Button) findViewById(R.id.IOS);

       BtnAndroid.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i = new Intent(PlgDashActivity.this, AndroidActivity.class);
               startActivity(i);
           }
       });

        BtnAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PlgDashActivity.this, AndroidActivity.class);
                startActivity(i);
            }
        });

        BtnJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(PlgDashActivity.this, AndroidActivity.class);
                startActivity(i2);
            }
        });

        BtnHTML.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(PlgDashActivity.this, AndroidActivity.class);
                startActivity(i3);
            }
        });


    }
}
