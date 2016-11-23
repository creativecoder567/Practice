package com.sarath.practice;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

/**
 * Created by sarath on 11/23/2016.
 */

public class CheckBoxTest extends AppCompatActivity implements View.OnClickListener {
    CheckBox cbCofee,cbMilk,cbTea;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkbox_test);

        cbCofee = (CheckBox) findViewById(R.id.cbCofee);
        cbCofee.setOnClickListener(this);

        cbMilk = (CheckBox) findViewById(R.id.cbMilk);
        cbMilk.setOnClickListener(this);

        cbTea = (CheckBox) findViewById(R.id.cbTea);
        cbTea.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        CheckBox checkBox = (CheckBox) view;
        switch (view.getId()){

            case R.id.cbCofee:
                if (checkBox.isChecked()){
                    Toast.makeText(this, "you selected Cofee", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.cbMilk:
                if (checkBox.isChecked()){
                    Toast.makeText(this, "you selected Milk", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.cbTea:
                if (checkBox.isChecked()){
                    Toast.makeText(this, "you selected Tea", Toast.LENGTH_SHORT).show();
                }
                break;
        }

    }
}
