package com.sundar.programming;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class AndroidActivity extends AppCompatActivity {

    PDFView android;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android);

        android = (PDFView) findViewById(R.id.pdf1);
        android.fromAsset("android_tutorial.pdf").load();


       /* android.fromAsset("iOSNotesForProfessionals.pdf").load();
        android.fromAsset("JavaNotesForProfessionals.pdf").load();
        android.fromAsset("php_tutorial Easy.pdf").load();

*/

    }
}
