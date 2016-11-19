package com.sarath.practice;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Set;

/**
 * Created by sarath on 11/14/2016.
 */

public class BluetoothList extends AppCompatActivity {
    TextView tvBluetooth;
    private static final int REQUEST_ENABLE_BT = 1;
    BluetoothAdapter bluetoothAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bluetooth);
        tvBluetooth =(TextView)findViewById(R.id.tvBluetooth);

        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        tvBluetooth.append("\nAdapter"+bluetoothAdapter);
        checkBluetoothState();
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==REQUEST_ENABLE_BT){
            checkBluetoothState();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
    private void checkBluetoothState() {
        if(bluetoothAdapter==null){
            tvBluetooth.append("\nBluetooth not Supported Aborting");
            return;
        }else {
            if(bluetoothAdapter.isEnabled()){
                tvBluetooth.append("\nBluetooth is enabled...");

                tvBluetooth.append("\nPaired devices are:");
                Set<BluetoothDevice>devices =bluetoothAdapter.getBondedDevices();
                for (BluetoothDevice device: devices){
                    tvBluetooth.append("\n Device "+device.getName()+","+device);
                }
            }
            else {
                Intent enableBtIntent= new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                startActivityForResult(enableBtIntent,REQUEST_ENABLE_BT);
            }
        }
    }

}
