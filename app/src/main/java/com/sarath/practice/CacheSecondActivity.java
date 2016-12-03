package com.sarath.practice;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by sarath on 12/3/2016.
 */

public class CacheSecondActivity extends AppCompatActivity {
    private EditText etLoad;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cache_second);
        etLoad = (EditText)findViewById(R.id.etCacheName2);
    }

    public void loadInternalCache(View view) {
        Log.d("sarath ","entered  ");
      File folder = getCacheDir();
      File myFile = new File(folder,"mydata1.txt");
        String data = readData(myFile);
        if (data!=null){
            etLoad.setText(data);
        }else {
            etLoad.setText("No Data Was Found");
        }
    }

    public void loadExternalCache(View view) {
        File folder = getExternalCacheDir();
        File myFile = new File(folder,"mydata2.txt");
        String data = readData(myFile);
        checkNull(data);
    }

    public void loadExternalPrivate(View view) {
        File folder = getExternalFilesDir("SarathCache");
        File myFile = new File(folder,"mydata3.txt");
        String data = readData(myFile);
        checkNull(data);
    }

    public void loadExternalPublic(View view) {
        File folder = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        File myFile = new File(folder,"mydata4.txt");
        String data = readData(myFile);
        checkNull(data);

    }

    public void loadPrevious(View view) {
        Intent intent = new Intent(this,CacheMain.class);
        startActivity(intent);
    }
    private String checkNull(String data){
        if (data!=null){
            etLoad.setText(data);
        }else {
            etLoad.setText("No Data Was Found");
        }
        return  data;
    }
    private String readData(File myFile){
        FileInputStream fileInputStream = null;
        try {
            fileInputStream=new FileInputStream(myFile);
            int read = -1;
            StringBuffer stringBuffer = new StringBuffer();
            while((read=fileInputStream.read())!=-1){
             stringBuffer.append((char)read);
            }
            return  stringBuffer.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (fileInputStream!=null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
