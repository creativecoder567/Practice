package com.sarath.practice;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by sarath on 11/23/2016.
 */

public class FrameLayoutExample extends AppCompatActivity implements View.OnClickListener {
    ImageView ivVanakkam,ivWelcome;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame_layout);
        ivVanakkam = (ImageView) findViewById(R.id.ivVanakkam);
        ivWelcome = (ImageView) findViewById(R.id.ivWelcome);

        ivVanakkam.setOnClickListener(this);
        ivWelcome.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view.getId()==R.id.ivVanakkam){
            ivVanakkam.setVisibility(View.GONE);
            ivWelcome.setVisibility(View.VISIBLE);
        }else {
            ivVanakkam.setVisibility(View.VISIBLE);
            ivWelcome.setVisibility(View.GONE);
        }

    }
}
