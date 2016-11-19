package com.sarath.practice;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.*;

/**
 * Created by sarath on 11/9/2016.
 */

public class ImageFromServer extends AppCompatActivity {

    Button getImage;
    ImageView imageView;
    String server_url ="http://172.20.10.7/welcome.jpg";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imagefromserver);
    }
}
