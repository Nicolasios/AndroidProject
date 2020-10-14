package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.listview.ListViewActivity;
import com.example.myapplication.recycleview.RecycleViewActivity;


public class MainActivity extends AppCompatActivity {
    private Button mBtnTextView;
    private  Button mBtnButton;
    private  Button mBtnViewEditor;
    private Button mBtnRadioButton;
    private Button mBtnCheckBox;
    private Button mBtnImageView;
    private Button mBtnListView;
    private Button mBtnRecycleView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnTextView = findViewById(R.id.button_1);
        mBtnButton = findViewById(R.id.button_2);
        mBtnViewEditor = findViewById(R.id.button_3);
        mBtnRadioButton = findViewById(R.id.button_4);
        mBtnCheckBox = findViewById(R.id.button_5);
        mBtnImageView = findViewById(R.id.button_6);
        mBtnListView = findViewById(R.id.button_7);
        mBtnRecycleView = findViewById(R.id.button_8);
        setListeners();
    }
    private void setListeners(){
        OnClick onClick = new OnClick();
        mBtnTextView.setOnClickListener(onClick);
        mBtnButton.setOnClickListener(onClick);
        mBtnViewEditor.setOnClickListener(onClick);
        mBtnRadioButton.setOnClickListener(onClick);
        mBtnCheckBox.setOnClickListener(onClick);
        mBtnImageView.setOnClickListener(onClick);
        mBtnListView.setOnClickListener(onClick);
        mBtnRecycleView.setOnClickListener(onClick);
    }
    public class OnClick implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Intent intent = null;
            if (view.getId() == R.id.button_1) {
                intent = new Intent(MainActivity.this, TextViewActivity.class);
            }
            if (view.getId() == R.id.button_2) {
                intent = new Intent(MainActivity.this,ButtonActivity.class);
            }
            if (view.getId() == R.id.button_3) {
                intent = new Intent(MainActivity.this, ViewEditorActivity.class);
            }
            if (view.getId() == R.id.button_4) {
                intent = new Intent(MainActivity.this, RadioButtonActivity.class);
            }
            if (view.getId() == R.id.button_5) {
                intent = new Intent(MainActivity.this, CheckBoxActivity.class);
            }
            if (view.getId() == R.id.button_6) {
                intent = new Intent(MainActivity.this, ImageViewActivity.class);
            }
            if (view.getId() == R.id.button_7) {
               intent = new Intent(MainActivity.this, ListViewActivity.class);
           }
            if (view.getId() == R.id.button_8) {
                intent = new Intent(MainActivity.this, RecycleViewActivity.class);
            }
            startActivity(intent);
        }
    }
}
