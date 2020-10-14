package com.example.myapplication.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.R;

public class LinearVRecycleActivity extends AppCompatActivity {
    private RecyclerView mRvLinear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_vrecycle);
        mRvLinear = findViewById(R.id.rv_linear);
        mRvLinear.setLayoutManager(new LinearLayoutManager(LinearVRecycleActivity.this));
        mRvLinear.setAdapter(new LinearAdapter((LinearVRecycleActivity.this)));
    }
}
