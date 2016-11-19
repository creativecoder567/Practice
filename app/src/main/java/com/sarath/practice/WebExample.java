package com.sarath.practice;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.webkit.WebView;

/**
 * Created by sarath on 11/16/2016.
 */

public class WebExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_example);

        WebView mywebview = (WebView) findViewById(R.id.wvExample);
        //mywebview.loadUrl("http://www.javatpoint.com/");

        /*String data = "<html><body><h1>Hello, Javatpoint!</h1></body></html>";
        mywebview.loadData(data, "text/html", "UTF-8"); */

        mywebview.loadUrl("file:///android_asset/simple.html");
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
*/
}