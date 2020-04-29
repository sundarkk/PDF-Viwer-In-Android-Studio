# PDF-Viwer-In-Android-Studio  
https://github.com/sundarkk/PDF-Viwer-In-Android-Studio
                                                            PDF Viewer

Add Dependencies- implementation 'com.github.barteksc:android-pdf-viewer:2.8.2'
                                         UI
<?xml version="1.0" encoding="utf-8"?>
<FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity"
    android:orientation="vertical"
    android:background="@drawable/poster">




</FrameLayout>

                                           MainActivity Java                     

package com.sundar.programming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {
                // This method will be executed once the timer is over
                Intent i = new Intent(MainActivity.this, DashActivity.class);
                startActivity(i);
                finish();
            }
        }, 2000);



    }
}
DashActivity
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".DashActivity"
    android:orientation="vertical"
    android:gravity="center">
    <androidx.cardview.widget.CardView
        android:layout_width="250dp"
        android:layout_height="50dp"
        app:cardCornerRadius="10dp"
        app:cardElevation="15dp"
        android:background="#009688">
        <Button
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:text="Programming Languages"
            android:textSize="18dp"
            android:background="#E0F2F1"
            android:typeface="serif"
            android:textStyle="bold"
            android:textColor="#009688"
            android:textAllCaps="false"
            android:id="@+id/BtnPl"/>
    </androidx.cardview.widget.CardView>

    <androidx.cardview.widget.CardView
        android:layout_width="250dp"
        android:layout_height="50dp"
        android:layout_marginTop="10dp"
        app:cardCornerRadius="10dp"
        app:cardElevation="15dp"
        android:background="#009688">
        <Button
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:text="Compiler"
            android:textSize="18dp"
            android:textAllCaps="false"
            android:background="#E0F2F1"
            android:typeface="serif"
            android:textStyle="bold"
            android:textColor="#009688"
            android:id="@+id/BtnComp"/>
    </androidx.cardview.widget.CardView>


</LinearLayout>

                                        DashActivity Java
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

PlgDashActivity
<?xml version="1.0" encoding="utf-8"?>
<FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".PlgDashActivity"
    android:orientation="vertical"
    android:background="@drawable/yor">

<LinearLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="vertical"
    android:layout_gravity="center">


    <androidx.cardview.widget.CardView
        android:layout_width="250dp"
        android:layout_height="50dp"
        app:cardCornerRadius="10dp"
        app:cardElevation="15dp"
        android:background="#009688"
        android:layout_gravity="center">

        <Button
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:text="Java"
            android:textSize="18dp"
            android:textAllCaps="false"
            android:background="#E0F2F1"
            android:typeface="serif"
            android:textStyle="bold"
            android:textColor="#009688"
            android:id="@+id/BtnJava"/>


    </androidx.cardview.widget.CardView>

    <androidx.cardview.widget.CardView
        android:layout_width="250dp"
        android:layout_height="50dp"
        android:layout_marginTop="10dp"
        app:cardCornerRadius="10dp"
        app:cardElevation="15dp"
        android:background="#009688"
        android:layout_gravity="center">

        <Button
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:text="Android Beginner"
            android:textSize="18dp"
            android:background="#E0F2F1"
            android:typeface="serif"
            android:textStyle="bold"
            android:textColor="#009688"
            android:textAllCaps="false"
            android:id="@+id/BtnAndroid"/>
    </androidx.cardview.widget.CardView>

    <androidx.cardview.widget.CardView
        android:layout_width="250dp"
        android:layout_height="50dp"
        app:cardCornerRadius="10dp"
        android:layout_marginTop="10dp"
        app:cardElevation="15dp"
        android:background="#009688"
        android:layout_gravity="center">
        <Button
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:text="HTML"
            android:textSize="18dp"
            android:background="#E0F2F1"
            android:typeface="serif"
            android:textStyle="bold"
            android:textColor="#009688"
            android:textAllCaps="false"
            android:id="@+id/BtnHTML"/>
    </androidx.cardview.widget.CardView>

    <androidx.cardview.widget.CardView
        android:layout_width="250dp"
        android:layout_height="50dp"
        android:layout_marginTop="10dp"
        app:cardCornerRadius="10dp"
        app:cardElevation="15dp"
        android:background="#009688"
        android:layout_gravity="center">
        <Button
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:text="IOS"
            android:textSize="18dp"
            android:textAllCaps="false"
            android:background="#E0F2F1"
            android:typeface="serif"
            android:textStyle="bold"
            android:textColor="#009688"
            android:id="@+id/IOS"/>
    </androidx.cardview.widget.CardView>




</LinearLayout>
</FrameLayout>

                                   PlgDashActivity Java
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




 

