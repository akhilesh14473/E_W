package com.example.akki.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class syllabuseee3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabuseee3);
        PDFView book=(PDFView)findViewById(R.id.pdfbook);
        book.fromAsset("EEE3.pdf").load();
    }
}
