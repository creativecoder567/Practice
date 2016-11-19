package com.sarath.practice;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by sarath on 11/13/2016.
 */


public class SensorTest extends AppCompatActivity {
    SensorManager sm = null;
    TextView textView1 = null;
    List list;

    SensorEventListener sel = new SensorEventListener(){
        public void onAccuracyChanged(Sensor sensor, int accuracy) {}
        public void onSensorChanged(SensorEvent event) {
            float[] values = event.values;
            textView1.setText("x: "+values[0]+"\ny: "+values[1]+"\nz: "+values[2]);
        }
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sensortest);

        /* Get a SensorManager instance */
        sm = (SensorManager)getSystemService(SENSOR_SERVICE);

        textView1 = (TextView)findViewById(R.id.textView1);

        list = sm.getSensorList(Sensor.TYPE_ACCELEROMETER);
        if(list.size()>0){
            sm.registerListener(sel, (Sensor) list.get(0), SensorManager.SENSOR_DELAY_NORMAL);
        }else{
            Toast.makeText(getBaseContext(), "Error: No Accelerometer.", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onStop() {
        if(list.size()>0){
            sm.unregisterListener(sel);
        }
        super.onStop();
    }
}
/*
public class SensorTest extends AppCompatActivity  {

    Sensor sensorac;
    SensorManager sensorManager=null;
    TextView acceleration=null;
    List list;

    SensorEventListener sensorEventListener = new SensorEventListener() {
        @Override
        public void onSensorChanged(SensorEvent sensorEvent) {
            float[] values =sensorEvent.values;
            acceleration.setText("x:"+values[0]+"\ny:"+values[1]+"\nz:"+values[2]);
        }

        @Override
        public void onAccuracyChanged(Sensor sensor, int i) {

        }
    };
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sensortest);
        sensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
        sensorac = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        //sensorManager.registerListener(this,sensorac,SensorManager.SENSOR_DELAY_NORMAL);
       list =sensorManager.getSensorList(Sensor.TYPE_ACCELEROMETER);
        if(list.size()>0){
            sensorManager.registerListener(sensorEventListener,(Sensor)list.get(0),SensorManager.SENSOR_DELAY_NORMAL);
        }else {
            Toast.makeText(getBaseContext(), "Error:No Accelerometer", Toast.LENGTH_SHORT).show();
        }
        acceleration = (TextView)findViewById(R.id.tvSensor);
    }

    @Override
    protected void onStop() {
        if(list.size()>0){
            sensorManager.unregisterListener(sensorEventListener);
        }
        super.onStop();
    }
    */
/*
    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
            acceleration.setText("X: "+sensorEvent.values[0]+
            "\nY: "+sensorEvent.values[1]+
            "\nZ: "+sensorEvent.values[2]   );

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }*//*

}
*/
