package com.example.viewpagerpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.viewpagerpractice.Adapter.Adapter;

public class MainActivity extends AppCompatActivity {
    ViewPager2 vpVertical,vpHorizontal;
    int [] images = {R.drawable.slide1,R.drawable.slide2,R.drawable.slide3};
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vpHorizontal = findViewById(R.id.vpHorizontal);
        vpVertical= findViewById(R.id.vpVertical);
        adapter = new Adapter(images);
        vpVertical.setAdapter(adapter);
        vpHorizontal.setAdapter(adapter);
       // vpHorizontal.setClipToPadding(false);
        vpHorizontal.setClipChildren(false);

    }
}