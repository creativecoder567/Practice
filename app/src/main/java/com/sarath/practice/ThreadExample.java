package com.sarath.practice;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by sarath on 12/6/2016.
 */

public class ThreadExample extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private EditText etUrls;
    private ListView lvurls;
    String[] listOfImages;
    ProgressBar progressBar;
    private LinearLayout loadingSection = null;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thread_example);
        etUrls =(EditText)findViewById(R.id.etUrl);
        lvurls=(ListView)findViewById(R.id.lvUrls);
        lvurls.setOnItemClickListener(this);
        listOfImages = getResources().getStringArray(R.array.imageUrls);
        progressBar = (ProgressBar)findViewById(R.id.progessThread);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
     etUrls.setText(listOfImages[i]);
    }

    public void downloadImage(View view) {
      //Thread myThread = new Thread(new DownloadImagesThread());
        //myThread.start();
    }
    public boolean downloadImageUsingThreads(String url){
        boolean successful = false;
        URL downloadurl=null;
        HttpURLConnection connection= null;
        InputStream inputStream=null;
        try {
             downloadurl =new URL(url);
              connection= (HttpURLConnection) downloadurl.openConnection();
              connection.getInputStream();
            int read=-1;
            while ((read=inputStream.read())!=-1){
                LogDemo.message(""+read);

            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (connection!=null){
                connection.disconnect();
            }
            if (inputStream!=null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return successful;
    }
    private class DownloadImagesThread implements Runnable{

        @Override
        public void run() {
            downloadImageUsingThreads(listOfImages[0]);
        }
    }
}
