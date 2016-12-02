package com.sarath.practice;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by sarath on 12/1/2016.
 */

public class SharedPref extends AppCompatActivity {
    EditText etUserName,etPassword;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shared_pref);
        etUserName = (EditText)findViewById(R.id.etUser1);
        etPassword = (EditText)findViewById(R.id.etPass1);
    }
    public void save(View view){
        SharedPreferences sharedpref = getSharedPreferences("MyData", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedpref.edit();
        editor.putString("name",etUserName.getText().toString());
        editor.putString("password",etPassword.getText().toString());
        editor.commit();
        Toast.makeText(this, "Data saved Successfully", Toast.LENGTH_SHORT).show();
    }
    public void  next(View view){
        Toast.makeText(this, "Another Activity", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getBaseContext(),AnotherActivity.class);
        startActivity(intent);
    }
}
