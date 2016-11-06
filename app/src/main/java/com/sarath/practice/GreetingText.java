package com.sarath.practice;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.*;
import android.widget.Button;

/**
 * Created by sarath on 11/5/2016.
 */

public class GreetingText extends AppCompatActivity {
    private EditText editText1,editText2;
    private android.widget.Button button;
    private TextView tvRes;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.greeting);
        editText1 =(EditText)findViewById(R.id.editText1);
        editText2 =(EditText)findViewById(R.id.editText2);
        tvRes = (TextView)findViewById(R.id.textView1);
        button =(Button)findViewById(R.id.button);

    }

    public void greetings(View view) {
        String lastName,firstName;
        lastName = editText2.getText().toString();
        firstName =editText1.getText().toString();
        tvRes.setText("hello, "+firstName+" "+lastName);
    }
}
