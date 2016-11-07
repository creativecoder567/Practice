package com.sarath.practice;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by sarath on 11/7/2016.
 */

public class HandleEvent extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.handle);
        Button clickMe =(Button)findViewById(R.id.btnClickMe);

        clickMe.setOnClickListener(new Button.OnClickListener(){
            public  void onClick(View view){
                TextView myText =(TextView)findViewById(R.id.tvHello);
                myText.setText("Event is handled on text");
            }
        });
    }
}
