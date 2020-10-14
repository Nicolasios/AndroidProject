package com.example.myapplication.recycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.R;

public class RecycleViewActivity extends AppCompatActivity {
    private Button mBtnCRecycle_lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);
        mBtnCRecycle_lv = findViewById(R.id.recycle_lv);
        mBtnCRecycle_lv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RecycleViewActivity.this,LinearVRecycleActivity.class);
                startActivity(intent);
            }
        });
    }
}
