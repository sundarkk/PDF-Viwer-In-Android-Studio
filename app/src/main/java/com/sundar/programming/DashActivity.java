package com.sundar.programming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashActivity extends AppCompatActivity {

    Button BtnPl, BtnComp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash);

        BtnPl = (Button) findViewById(R.id.BtnPl);
        BtnComp = (Button) findViewById(R.id.BtnComp);


        BtnPl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(DashActivity.this, PlgDashActivity.class);
                startActivity(i);

            }
        });

        BtnComp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
