package com.sarath.shareapp1;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

public class MainActivity extends AppCompatActivity {

    private EditText messageFromApp1;
    TextView status;

    String packageName="com.sarath.practice";
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        messageFromApp1 =(EditText)findViewById(R.id.etShareApp2);
        status =(TextView)findViewById(R.id.tvShareApp2);
    }

    public void loadFile(View view) {
        PackageManager packageManager = getPackageManager();
        try {
          ApplicationInfo applicationInfo= packageManager.getApplicationInfo(packageName,PackageManager.GET_META_DATA);
            status.setText(applicationInfo.dataDir + "/files/sarath.txt");
            String fullPath =applicationInfo.dataDir + "/files/sarath.txt";
            readFile(fullPath);
        } catch (PackageManager.NameNotFoundException e) {
           status.setTextColor(Color.RED);
           status.setText(e+ " ");
        }
    }
    public void readFile(String fullPath){
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(new File(fullPath));
            int read =-1;
            StringBuffer stringBuffer = new StringBuffer();
            while((read = fileInputStream.read())!=-1   ){
              stringBuffer.append((char)read);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
