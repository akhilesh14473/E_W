package com.example.akki.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class html extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_html);
        PDFView book=(PDFView)findViewById(R.id.pdfbook);
        book.fromAsset("HTML.pdf").load();
    }
}
