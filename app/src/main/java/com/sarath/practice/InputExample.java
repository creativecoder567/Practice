package com.sarath.practice;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by sarath on 11/26/2016.
 */

public class InputExample extends AppCompatActivity implements TextView.OnEditorActionListener {
   private EditText editText;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_example);
        editText = (EditText) findViewById(R.id.etInput);
        editText.setOnEditorActionListener(this);
    }

    @Override
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if(i== EditorInfo.IME_ACTION_DONE)
        {
            Toast.makeText(this, "you clicked done button", Toast.LENGTH_SHORT).show();
        }
        return false;
    }
}
