package com.sarath.practice;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by sarath on 12/5/2016.
 */

public class ShareApp1 extends AppCompatActivity {
    private EditText messageBox;
    private TextView status;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shareapp1);
        messageBox=(EditText)findViewById(R.id.etShareApp);
        status= (TextView)findViewById(R.id.tvShare);
    }

    public void saveToFile(View view) {
        File file = null;
        String text1 = messageBox.getText().toString();
        FileOutputStream fileOutputStream =null;
        try {
            file = getFilesDir();
            fileOutputStream = openFileOutput("sarath.txt", Context.MODE_PRIVATE);
            fileOutputStream.write(text1.getBytes());
            status.setTextColor(Color.BLUE);
            status.setText(text1 +" \nWritten to \n" +file.getAbsolutePath());
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
