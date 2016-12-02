package com.sarath.practice;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by sarath on 12/1/2016.
 */

public class AnotherActivity extends AppCompatActivity {

    public  static final String DEFAULT ="N/A";
    TextView tvUserName,tvPassword;
    EditText etUser,etPassword;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.another_activity);
        tvUserName =(TextView)findViewById(R.id.tvUser1);
        tvPassword =(TextView)findViewById(R.id.tvPass1);
        etUser = (EditText) findViewById(R.id.etUser1);
        etPassword = (EditText) findViewById(R.id.etPass1);
    }
    public void load(View view) throws IOException {
        FileInputStream fileInputStream=openFileInput("sarath.txt");
        StringBuffer stringBuffer = new StringBuffer();
        int read;
        read=-1;
        while ((read =fileInputStream.read())!=-1);{
         stringBuffer.append((char)read);
        }
        String username = stringBuffer.substring(0,stringBuffer.indexOf(" "));
        String password = stringBuffer.substring(stringBuffer.indexOf(" ")+1);
        etUser.setText(username);
        etPassword.setText(password);
        /*SharedPreferences sharedpref = getSharedPreferences("MyData", Context.MODE_PRIVATE);
        String name=sharedpref.getString("name","DEFAULT ");
        String password=sharedpref.getString("password","DEFAULT ");
        if(name.equals(DEFAULT)||password.equals(DEFAULT)){
            Toast.makeText(this, "No Data Was Found", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Data Loaded Successfully", Toast.LENGTH_SHORT).show();
            etUser.setText(name);
            etPassword.setText(password);
        }
*/
    }
    public  void previous(View view){
        Toast.makeText(this, "previous", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,SharedPref.class);
        startActivity(intent);
    }
}
