package com.sarath.practice;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

/**
 * Created by sarath on 12/4/2016.
 */

public class SQLiteMain extends AppCompatActivity {
    EditText sqlName,sqlPass;
    SQLiteDemo sqLiteDemo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sqlite_main);
        sqLiteDemo = new SQLiteDemo(this);

        sqlName = (EditText)findViewById(R.id.etSqlName);
        sqlPass = (EditText)findViewById(R.id.etSqlPass);

    }
    public void addUser(View view){
        String user = sqlName.getText().toString();
        String pass = sqlPass.getText().toString();

        SQLiteDatabase sqLiteDatabase= sqLiteDemo.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

    }
}
