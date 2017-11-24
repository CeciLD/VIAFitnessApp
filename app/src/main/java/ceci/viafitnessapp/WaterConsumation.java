package ceci.viafitnessapp;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import static ceci.viafitnessapp.R.id.progressBar;

/**
 * Created by lenovo on 10-Nov-17.
 */

public class WaterConsumation extends AppCompatActivity {

    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle saveInstanceStats) {
        super.onCreate(saveInstanceStats);
        setContentView(R.layout.water_consumption);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);

    }
    private boolean waterDrink;
    private int progress = 0;
    private boolean clicked;
    public void countTimer(){
        new CountDownTimer(30000, 1000) {
            public void onTick(long millisUntilFinished) {

            }

            public void onFinish() {
                if(waterDrink = true){
                    notificationcall();
                }
                waterDrink = false;
            }
        }.start();
    }
    public void add250Button(View view) {

        if (progress < 100) {
            progressBar.setProgress(progress + 8);
            progress += 8;

            if(waterDrink = true){
                countTimer();
            }

        } else progress = 100;

        if (progress == 100)
            Toast.makeText(WaterConsumation.this, "Congratulations, you reached your daily goal", Toast.LENGTH_LONG).show();
    }
    public void notificationcall() {

            NotificationCompat.Builder notificationBuilder = (NotificationCompat.Builder) new NotificationCompat.Builder(this)
                    .setDefaults(NotificationCompat.DEFAULT_ALL)
                    .setSmallIcon(R.drawable.water_consumption_glass)
                    .setContentTitle("Drink water")
                    .setContentText("You didn't drink water in the past 30 seconds");

            NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
            notificationManager.notify(1, notificationBuilder.build());


    }

    public void reset(View view){
        progress = 0;
        progressBar.setProgress(0);
    }
    public void add500Button(View view) {
        countTimer();
        if (progress < 100) {
            progressBar.setProgress(progress + 16);
            progress += 16;
        } else progress = 100;

        if (progress == 100)
            Toast.makeText(WaterConsumation.this, "Congratulations, you reached your daily goal", Toast.LENGTH_LONG).show();
    }

    protected void onPause() {
        super.onPause();
        SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("Data", progressBar.getProgress());
        editor.commit();
    }

    public void onResume() {
        super.onResume();
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
        progress = sharedPref.getInt("Data", 0);
        progressBar.setProgress(progress);
    }

    public void onStop() {
        super.onStop();
    }



}
