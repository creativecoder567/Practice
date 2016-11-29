package com.sarath.practice;

import android.app.Activity;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by sarath on 11/29/2016.
 */

public class MyDialog extends DialogFragment implements View.OnClickListener {

    Button btnYes,btnNo;
    communicator com;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        com = (communicator) activity;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.my_dialog,null);
        btnYes= (Button) view.findViewById(R.id.btnYes);
        btnNo = (Button) view.findViewById(R.id.btnNo);
        btnYes.setOnClickListener(this);
        btnNo.setOnClickListener(this);
        setCancelable(false);
        return view;
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.btnYes){
            com.onDialogmessage("Yes was clicked");
            dismiss();
        }else {
            com.onDialogmessage("No was clicked");
            dismiss();
        }
    }
    interface communicator{
        public void onDialogmessage(String message);
    }
}
