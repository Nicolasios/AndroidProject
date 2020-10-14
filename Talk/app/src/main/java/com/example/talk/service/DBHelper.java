package com.example.talk.service;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;


public class DBHelper extends SQLiteOpenHelper {

    private static final String DATABASENAME = "Info.db";
    private static final int DATABASEVERSION = 1;

    private static final String TAG = "DBHelper";

    public DBHelper(@Nullable Context context) {
        super(context, DATABASENAME, null, DATABASEVERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
//        //创建数据表时候的回调
        Log.d(TAG,"创建数据库");
        String CREATE_TABLE_USER_INFO = "create table User("
                + "username text primary key, "
                + "email text, "
                + "password text)";
        sqLiteDatabase.execSQL(CREATE_TABLE_USER_INFO);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        //升级数据库的时候回调
        Log.d(TAG,"升级数据库");
//        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+ UserInfo.TABLE);
//        onCreate(sqLiteDatabase);
    }
}
