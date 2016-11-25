package com.sarath.practice;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by sarath on 11/24/2016.
 */

public class ListViewImage extends AppCompatActivity{
    ListView listView;
    String[] days={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_image);
        listView = (ListView) findViewById(R.id.lvImage);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.list_image_row,R.id.imageRow,days);
        listView.setAdapter(arrayAdapter);
    }
}
