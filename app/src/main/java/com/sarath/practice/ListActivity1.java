package com.sarath.practice;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by sarath on 11/24/2016.
 */

public class ListActivity1 extends ListActivity {

    String[] days={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view1);
        listView = getListView();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,days);
        listView.setAdapter(arrayAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        TextView textView = (TextView) v;
        Toast.makeText(this, ""+textView.getText()+" "+position, Toast.LENGTH_SHORT).show();
    }
}
