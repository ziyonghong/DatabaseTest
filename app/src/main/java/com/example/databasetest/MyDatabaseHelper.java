package com.example.databasetest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class MyDatabaseHelper extends SQLiteOpenHelper {
    public static final String CREATE_BOOK = "create table book ("
            + "id integer primary key autoincrement, " + "author text, "
            + "price real, " + "pages integer, " + "name text)";
    private Context mContext;
    public MyDatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory
            factory, int version) {
        super(context, name, factory, version);
        mContext = context;
    }

    public  void onCreate(SQLiteDatabase db){
        db.execSQL(CREATE_BOOK);  //执行建表语句
       Toast.makeText(mContext, "create succeeded", Toast.LENGTH_SHORT).show();
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) { }
}