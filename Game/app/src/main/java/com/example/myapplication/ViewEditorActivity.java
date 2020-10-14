package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.EditText;

public class ViewEditorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_editor);
        //控制登录用户名图标大小
        EditText editText_1 = findViewById(R.id.et_1);
        Drawable drawable_1 = getResources().getDrawable(R.drawable.username);
        drawable_1.setBounds(0,0,60,60);
        editText_1.setCompoundDrawables(drawable_1,null,null,null);
        EditText editText_2 = findViewById(R.id.et_3);
        Drawable drawable_2 = getResources().getDrawable(R.drawable.password);
        drawable_2.setBounds(0,0,60,60);
        editText_2.setCompoundDrawables(drawable_2,null,null,null);
        //添加监听事件
        

    }
}
