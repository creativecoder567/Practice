package com.sarath.practice;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by sarath on 12/4/2016.
 */

public class Message {
    public static void message(Context context,String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
