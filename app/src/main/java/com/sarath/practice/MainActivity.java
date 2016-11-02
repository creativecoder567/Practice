package com.sarath.practice;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleButton;
    private WifiManager wifiManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wifiManager =(WifiManager)this.getSystemService(Context.WIFI_SERVICE);

        toggleButton = (ToggleButton)findViewById(R.id.toggleButton);
        toggleButton.setChecked(wifiManager.isWifiEnabled());
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
             wifiManager.setWifiEnabled(isChecked);
            }
        });
    }
}
