package com.example.talk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.talk.service.DBHelper;
import com.example.talk.service.Dao;
import com.example.talk.service.UserInfo;

import java.net.Inet4Address;

public class RegisterActivity extends AppCompatActivity {
    private Button mBtnConfirm,getmBtnCancel;
    private EditText mEdtEmail,mEdtUsername,mEdtPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mBtnConfirm = findViewById(R.id.btn_reg_confirm);
        getmBtnCancel = findViewById(R.id.btn_reg_cancel);
        mEdtEmail = findViewById(R.id.et_email);
        mEdtPassword = findViewById(R.id.et_password);
        mEdtUsername = findViewById(R.id.et_username);
        mBtnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserInfo userInfo  = new UserInfo();
                userInfo.setEmail(mEdtEmail.getText().toString());
                userInfo.setPassword(mEdtPassword.getText().toString());
                userInfo.setUsername(mEdtUsername.getText().toString());
                DBHelper helper = new DBHelper(RegisterActivity.this);
                helper.getWritableDatabase();
                Dao dao = new Dao(RegisterActivity.this);
                dao.insert(userInfo);
                Toast.makeText(RegisterActivity.this,"注册成功",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(intent);
                startActivityForResult(intent,1);

            }
        });
    }
}
