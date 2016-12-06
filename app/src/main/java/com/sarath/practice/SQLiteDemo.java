package com.sarath.practice;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by sarath on 12/4/2016.
 */
 class SarathAdapter{

    public void insertData(String name,String password){

     }
}
public class SQLiteDemo extends SQLiteOpenHelper {

   private static final String DATABASE_NAME ="SARATHDB";
    private static final String TABLE_NAME ="SARATHTABLE";
    private static final int DATABASE_VERSION=2;
    private static final String UID ="_id";
    private static final String NAME="Name";
    private static final String PASSWORD="Password";
    private static final String ADDRESS="Address";
    private static final String CREATE_TABLE = "CREATE TABLE "+TABLE_NAME+
            "("+UID+" INTEGER PRIMARY KEY AUTOINCREMENT,"+NAME
            +" VARCHAR(255),"+PASSWORD+"VARCHAR(255));";
    private static final String DROP_TABLE="DROP TABLE IF EXISTS"+TABLE_NAME;
    private Context context;
    public SQLiteDemo(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        Message.message(context,"constructor called");
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
    //String CREATE = "CREATE TABLE "+TABLE_NAME+"("+UID+" INTEGER PRIMARY KEY AUTOINCREMENT,"+NAME+" VARCHAR(255));";
        try {
            sqLiteDatabase.execSQL(CREATE_TABLE);
            Message.message(context, " onCreate called");
        }catch (SQLiteException e){
            Message.message(context,"" +e);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(DROP_TABLE);
        onCreate(sqLiteDatabase);
        try {
            Message.message(context,"onUpgrade called");
            sqLiteDatabase.execSQL(DROP_TABLE);
            onCreate(sqLiteDatabase);
        }catch (SQLiteException e){
            Message.message(context,""+e);
        }

    }
}
