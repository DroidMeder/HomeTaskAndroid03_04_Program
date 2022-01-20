package com.example.hometaskandroid03_04_program;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.media.Image;
import android.os.Bundle;
import android.os.Environment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Adaptor adaptor;
    private ArrayList<String> names;
    private ArrayList<Integer> images;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler);
        loadData();
        adaptor= new Adaptor(names, images);
        recyclerView.setAdapter(adaptor);
    }

    private void loadData() {
        names = new ArrayList<>();
        names.add("C");
        names.add("C++");
        names.add("C#");
        names.add("CSS");
        names.add("Django");
        names.add("Java");
        names.add("JavaScript");
        names.add("Perl");
        names.add("PHP");
        names.add("Python");
        names.add("R");
        names.add("Ruby");
        names.add("Scala");
        names.add("SQL");
        names.add("Swift");

        images = new ArrayList<>();
        images.add(R.drawable.c);
        images.add(R.drawable.c_plus);
        images.add(R.drawable.c_sharp);
        images.add(R.drawable.css);
        images.add(R.drawable.django);
        images.add(R.drawable.java);
        images.add(R.drawable.javascript);
        images.add(R.drawable.perl);
        images.add(R.drawable.php);
        images.add(R.drawable.python);
        images.add(R.drawable.r);
        images.add(R.drawable.ruby);
        images.add(R.drawable.scala);
        images.add(R.drawable.sql);
        images.add(R.drawable.swift);
    }
}