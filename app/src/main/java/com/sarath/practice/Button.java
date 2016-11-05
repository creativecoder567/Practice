package com.sarath.practice;

import android.os.Bundle;
import android.renderscript.Sampler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by sarath on 11/5/2016.
 */

public class Button extends AppCompatActivity {
    private EditText editText1,editText2;
    private android.widget.Button btnsum;
    private TextView tv;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button);
        addListenerOnButton();
    }
    public  void addListenerOnButton(){
        editText1=(EditText)findViewById(R.id.editText1);
        editText2=(EditText)findViewById(R.id.editText2);
        btnsum = (android.widget.Button)findViewById(R.id.btnsum);
        tv = (TextView)findViewById(R.id.textView);

        btnsum.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
               double num1=0,num2=0;
                try {
                    num1 = Double.parseDouble(editText1.getText().toString());
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "Enter Number", Toast.LENGTH_SHORT).show();
                }
                try{
                    num2 = Double.parseDouble(editText2.getText().toString());
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(), "Enter Number", Toast.LENGTH_SHORT).show();
                }

                 Double sum =num1+num2;
                 tv.setText(String.valueOf(sum));


            }
        });

    }
}
