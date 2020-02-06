package com.example.databasetest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class MyDatabaseHelper extends SQLiteOpenHelper {
    public static final String CREATE_BOOK = "create table book ("
            + "id integer primary key autoincrement, " + "author text, "
            + "price real, " + "pages integer, " + "name text)";
    public static final String CREATE_CATEGORY = "create table Category ("
            + "id integer primary key autoincrement, " + "category_name text, " + "category_code integer)";

    private Context mContext;
    public MyDatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory
            factory, int version) {
        super(context, name, factory, version);
        mContext = context;
    }

    public  void onCreate(SQLiteDatabase db){

       Toast.makeText(mContext, "create succeeded", Toast.LENGTH_SHORT).show();
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(CREATE_BOOK);  //执行建表语句
        db.execSQL(CREATE_CATEGORY);
        onCreate(db);
    }
}
