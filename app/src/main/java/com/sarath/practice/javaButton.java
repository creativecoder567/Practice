package com.sarath.practice;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;
import android.content.res.Resources;
import android.util.TypedValue;

/**
 * Created by sarath on 11/6/2016.
 */

public class javaButton extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RelativeLayout myRLayout = new RelativeLayout(this);
       // myRLayout.setBackgroundColor(Color.BLUE);

        Button myButton = new Button(this);
        myButton.setText("Click me");
        myButton.setBackgroundColor(Color.YELLOW);

        EditText username = new EditText(this);
        myButton.setId(1);
        username.setId(2);
        RelativeLayout.LayoutParams buttonDetails = new RelativeLayout.LayoutParams(
        RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

        RelativeLayout.LayoutParams usernameDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

        usernameDetails.addRule(RelativeLayout.ABOVE,myButton.getId());
        usernameDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        usernameDetails.setMargins(0,0,0,50);

        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);

        Resources resources =getResources();
        int px =(int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,200,
                resources.getDisplayMetrics());
        username.setWidth(px);


        myRLayout.addView(myButton,buttonDetails);
        myRLayout.addView(username,usernameDetails);
        setContentView(myRLayout);


    }
}
