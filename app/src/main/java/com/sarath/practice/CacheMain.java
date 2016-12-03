package com.sarath.practice;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by sarath on 12/3/2016.
 */

public class CacheMain extends AppCompatActivity {
   EditText etUserName;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cache_main);
        etUserName=(EditText)findViewById(R.id.etCacheName);
    }

    public void saveInternalCache(View view) {
        String data =etUserName.getText().toString();
        File folder = getCacheDir();
        File myFile = new File(folder,"mydata1.txt");
        writeData(myFile,data);
    }

    public void saveExternalCache(View view) {
        String data =etUserName.getText().toString();
        File folder = getExternalCacheDir();
        File myFile = new File(folder,"mydata2.txt");
        writeData(myFile,data);
    }

    public void saveExternalPrivate(View view) {
        String data =etUserName.getText().toString();
        File folder = getExternalFilesDir("SarathCache");
        File myFile = new File(folder,"mydata3.txt");
        writeData(myFile,data);
    }

    public void saveExternalPublic(View view) {
        String data =etUserName.getText().toString();
        File folder = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        File myFile = new File(folder,"mydata4.txt");
        writeData(myFile,data);
    }
    private void writeData(File myFile,String data){
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(myFile);
            fileOutputStream.write(data.getBytes());
            if(data==null) {
                message(data + " Was Written Successfully " + myFile.getAbsolutePath());
            }
            else {
                Toast.makeText(this, "Please Enter data", Toast.LENGTH_SHORT).show();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (fileOutputStream!=null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    private void message(String s) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }

    public void NextActivity(View view) {
        Intent intent = new Intent(this,CacheSecondActivity.class);
        startActivity(intent);
    }
}
