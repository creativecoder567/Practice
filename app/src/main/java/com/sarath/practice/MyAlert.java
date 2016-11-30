package com.sarath.practice;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

/**
 * Created by sarath on 11/30/2016.
 */

public class MyAlert extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder =  new AlertDialog.Builder(getActivity());
        LayoutInflater layoutInflater = getActivity().getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.my_alert,null);
        builder.setView(view);
        builder.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(), "Negative Button is clicked", Toast.LENGTH_SHORT).show();
            }
        });
        builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(), "Positive Button is clicked", Toast.LENGTH_SHORT).show();
            }
        });
        Dialog dialog = builder.create();
        return dialog;
    }

    /*
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("My Dialog");
        builder.setMultiChoiceItems(R.array.days, null, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                Toast.makeText(getActivity(), "Item from position "+i+ " is selected "+b, Toast.LENGTH_SHORT).show();
            }
        });
        *//*builder.setItems(R.array.days, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(), "Item was clicked "+i, Toast.LENGTH_SHORT).show();
            }
        });*//*
        //builder.setMessage("Do you like this Dialog");
        builder.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(), "Negative button is clicked", Toast.LENGTH_SHORT).show();
            }
        });
        builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(), "Positive Button is clicked", Toast.LENGTH_SHORT).show();
            }
        });
        Dialog dialog = builder.create();
        return dialog;
    }*/
}
