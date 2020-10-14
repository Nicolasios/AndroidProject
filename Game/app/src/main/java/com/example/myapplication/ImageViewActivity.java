package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImageViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        ImageView iv_2 = findViewById(R.id.iv_2);
        Glide.with(this).load("https://cdn2.lmonkey.com/94f152aaa94d937ccf5de78f3fcac59f/3b6e32e7bc8145a283431f260c3c1d1a.png").into(iv_2);
    }
}
