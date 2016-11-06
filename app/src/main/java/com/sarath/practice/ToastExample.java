package com.sarath.practice;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by sarath on 11/6/2016.
 */

public class ToastExample extends AppCompatActivity {
    private android.widget.Toast toast;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toast);
    }
    public void topLeft(View view){
        toast= Toast.makeText(getApplicationContext(),"Top Left", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);
        toast.show();
    }

    public void topCenter(View view){
        toast= Toast.makeText(getApplicationContext(),"Top Center", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP|Gravity.CENTER, 0, 0);
        toast.show();
    }

    public void topRight(View view){
        toast= Toast.makeText(getApplicationContext(),"Top Right", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP|Gravity.RIGHT, 0, 0);
        toast.show();
    }

    public void midLeft(View view){
        toast= Toast.makeText(getApplicationContext(),"Mid Left", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER|Gravity.LEFT, 0, 0);
        toast.show();
    }

    public void midCenter(View view){
        toast= Toast.makeText(getApplicationContext(),"Mid Center", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER, 0, 0);
        toast.show();
    }

    public void midRight(View view){
        toast= Toast.makeText(getApplicationContext(),"Mid Right", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER|Gravity.RIGHT, 0, 0);
        toast.show();
    }

    public void bottomLeft(View view){
        toast= Toast.makeText(getApplicationContext(),"Bottom Left", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM|Gravity.LEFT, 0, 0);
        toast.show();
    }

    public void bottomCenter(View view){
        toast= Toast.makeText(getApplicationContext(),"Bottom Center", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 0);
        toast.show();
    }

    public void bottomRight(View view){
        toast= Toast.makeText(getApplicationContext(),"Bottom Right", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM|Gravity.RIGHT, 0, 0);
        toast.show();
    }



}
