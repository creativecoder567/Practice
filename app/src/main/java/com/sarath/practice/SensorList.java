package com.sarath.practice;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by sarath on 11/14/2016.
 */

public class SensorList extends AppCompatActivity {
    SensorManager sensorManager;
    List<Sensor> sensors;
    TextView tvSensorList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sensor);

        tvSensorList=(TextView)findViewById(R.id.tvSensor);
        sensorManager=(SensorManager)getSystemService(SENSOR_SERVICE);
        sensors=sensorManager.getSensorList(Sensor.TYPE_ALL);

        for (Sensor s :sensors){
            tvSensorList.append("\n\n"+s.getName());
        }
        //not worked
       /* for(Sensor s:sensors){
            Log.i("Sensors",""+s.getName());
        }
        //not worked
       */ /*lvSensorList =(ListView)findViewById(R.id.lvSensor);
        sensorManager =(SensorManager)this.getSystemService(Context.SENSOR_SERVICE);
        sensors =sensorManager.getSensorList(Sensor.TYPE_ALL);
        lvSensorList.setAdapter(new ArrayAdapter<Sensor>(this,R.layout.sensor));
 */   }
}
