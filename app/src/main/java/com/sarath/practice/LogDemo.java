package com.sarath.practice;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by sarath on 12/7/2016.
 */

public class LogDemo {
    public static void message(String message){
        Log.d("sarath",message);
    }
    public static void s(Context context,String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
