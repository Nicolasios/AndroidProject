package com.example.talk.service;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class Dao {

    private final DBHelper mHelper;

    private static final String TAG = "Database";

    public Dao(Context context){
        mHelper = new DBHelper(context);
    }
    public void insert(UserInfo userInfo){
        Log.d(TAG,"插入数据");
        SQLiteDatabase db = mHelper.getWritableDatabase();
        String sql ="insert into User(username,email,password) VALUES(?,?,?)";
        Object info[] = {
                userInfo.getUsername(),
                userInfo.getEmail(),
                userInfo.getPassword()
        };
        db.execSQL(sql,info);
        db.close();
    }
    public void delete(){

    }
    public void updata(){

    }
    public void query(){

    }
}
