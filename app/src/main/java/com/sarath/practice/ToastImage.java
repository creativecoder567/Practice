package com.sarath.practice;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by sarath on 11/19/2016.
 */

public class ToastImage extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toast_image);
    }

    public void showToast(View view) {
        Toast toast = new Toast(this);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM,0,0);

        LayoutInflater layoutInflater = getLayoutInflater();
        View appearance = layoutInflater.inflate(R.layout.toast_image1,(ViewGroup)findViewById(R.id.toastRoot));
        toast.setView(appearance);
        toast.show();
    }
}
