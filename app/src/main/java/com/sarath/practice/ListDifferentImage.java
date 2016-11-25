package com.sarath.practice;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by sarath on 11/24/2016.
 */

public class ListDifferentImage extends AppCompatActivity {
    ListView list;
    String[] smileyTitles;
    String[] smileyDescription;
    int[] images = {R.drawable.smiley_1,R.drawable.smiley_2,R.drawable.smiley_3,R.drawable.smiley_4,R.drawable.smiley_5,R.drawable.smiley_6,
            R.drawable.smiley_7,R.drawable.smiley_8,R.drawable.smiley_9,R.drawable.smiley_10};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_smiley);

        Resources resources = getResources();
        smileyTitles= resources.getStringArray(R.array.titles);
        smileyDescription = resources.getStringArray(R.array.description);

        list = (ListView)findViewById(R.id.lvSmiley);
        SmileyAdapter smileyAdapter = new SmileyAdapter(this,smileyTitles,images,smileyDescription);
        list.setAdapter(smileyAdapter);
    }
}
class SmileyAdapter extends ArrayAdapter<String>{

    Context context;
    int[]  images;
    String titleArray[];
    String descriptionArray[];
    SmileyAdapter(Context c,String[] titles, int imgs[],String[] desc){
    super(c,R.layout.listimage_smiley,R.id.tvTitle,titles);
    this.context=c;
    this.images =imgs;
        this.titleArray=titles;
        this.descriptionArray=desc;
}
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.listimage_smiley,parent,false);

        ImageView smiley = (ImageView) row.findViewById(R.id.ivSmiley);
        TextView Title = (TextView)row.findViewById(R.id.tvTitle);
        TextView Description = (TextView)row.findViewById(R.id.tvDescription);

        smiley.setImageResource(images[position]);
        Title.setText(titleArray[position]);
        Description.setText(descriptionArray[position]);
        return row;
    }

}
