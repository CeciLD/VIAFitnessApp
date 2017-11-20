package ceci.viafitnessapp;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class Pedometer extends AppCompatActivity implements SensorEventListener, StepListener {
    private TextView TvSteps, calories, distance;
    private StepDetector simpleStepDetector;
    private SensorManager sensorManager;
    private Sensor accel;
    private static final String TEXT_NUM_STEPS = "Steps: ", TEXT_KCAL_BURNED = "kcal: ", TEXT_DISTANCE_WALKED = " meters";
    private int numSteps = 0;
    boolean running = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedometer);


        // Get an instance of the SensorManager
        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        simpleStepDetector = new StepDetector();
        simpleStepDetector.registerListener(this);
        accel = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        TvSteps = (TextView) findViewById(R.id.tv_steps);
        calories = (TextView) findViewById(R.id.kcal);
        distance = (TextView) findViewById(R.id.distance);
    }

    @Override
    protected void onPause() {

        super.onPause();
        sensorManager.unregisterListener(Pedometer.this);

        running = false;
    }

    @Override
    protected void onResume() {
        super.onResume();
        running = true;

        if (accel != null) {
            sensorManager.registerListener(Pedometer.this, accel, SensorManager.SENSOR_DELAY_FASTEST);
        } else {
            Toast.makeText(this, "Pedometer not supported", Toast.LENGTH_SHORT).show();

        }
    }


    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        if (running) {
            simpleStepDetector.updateAccel(
                    event.timestamp, event.values[0], event.values[1], event.values[2]);
        }
    }

    @Override
    public void step(long timeNs) {
        numSteps++;
        kcal_counter();
        distance_walked();
        TvSteps.setText(TEXT_NUM_STEPS + numSteps);
    }

    public void kcal_counter() {
        double kcal = 0;
        for (int i = 0; i < numSteps; i++) {
            kcal = kcal + 0.044;
        }
        calories.setText(TEXT_KCAL_BURNED + (int) kcal);
    }

    public void distance_walked() {
        double meters = 0;
        for (int i = 0; i < numSteps; i++) {
            meters = meters + 0.762;
        }
        distance.setText((int) meters + TEXT_DISTANCE_WALKED);
    }
}

