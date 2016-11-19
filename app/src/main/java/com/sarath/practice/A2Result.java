package com.sarath.practice;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by sarath on 11/14/2016.
 */
public class A2Result extends AppCompatActivity{

    EditText eta2;
    Button btna2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a2result);
        eta2= (EditText)findViewById(R.id.eta2);
        btna2 = (Button) findViewById(R.id.btna2);
        btna2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                String message=eta2.getText().toString();
                Intent intent=new Intent();
                intent.putExtra("MESSAGE",message);
                setResult(2,intent);
                finish();//finishing activity
            }
        });
    }
}
