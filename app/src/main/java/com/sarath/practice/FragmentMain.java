package com.sarath.practice;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by sarath on 11/29/2016.
 */

public class FragmentMain extends AppCompatActivity /*implements MyDialog.communicator*/ {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main);

    }

    /*@Override
    public void respond(int i) {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentB fragmentB = (FragmentB) fragmentManager.findFragmentById(R.id.fragB);
        fragmentB.changeData(i);
    }*/
    public void showDialog(View view){

        MyAlert myalert = new MyAlert();
        myalert.show(getFragmentManager(),"MyAlert");

        /*FragmentManager fragmentManager = getFragmentManager();
        MyDialog myDialog =new MyDialog();
        myDialog.show(fragmentManager,"MyDialog");*/
    }
    public void showFragment(View view){
        MyAlert myAlert = new MyAlert();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.group,myAlert,"My Alert Fragment");
        transaction.commit();
    }

   /* @Override
    public void onDialogmessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

    }*/
}
