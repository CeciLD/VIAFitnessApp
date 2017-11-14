package ceci.viafitnessapp;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import static ceci.viafitnessapp.R.id.progressBar;

/**
 * Created by lenovo on 10-Nov-17.
 */

public class WaterConsumation extends AppCompatActivity{

    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle saveInstanceStats) {
        super.onCreate(saveInstanceStats);
        setContentView(R.layout.water_consumption);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);


    }
    private int progress = 0;
    public void add250Button(View view){
        if(progress<100){
            progressBar.setProgress(progress + 8);
            progress += 8;
        }else progress = 100;

        if(progress == 100)
            Toast.makeText(WaterConsumation.this, "Congratulations, you reached your daily goal", Toast.LENGTH_LONG).show();
    }

    public void add500Button(View view){

        if(progress<100){
            progressBar.setProgress(progress + 16);
            progress += 16;
        }else progress = 100;

        if(progress == 100)
            Toast.makeText(WaterConsumation.this, "Congratulations, you reached your daily goal", Toast.LENGTH_LONG).show();
    }
    protected void onPause(){
        super.onPause();
        SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("Data",progressBar.getProgress());
        editor.commit();
    }
    public void onResume(){
        super.onResume();
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
        progress = sharedPref.getInt("Data", 0);
        progressBar.setProgress(progress);
    }
    public void onStop(){
        super.onStop();
    }

}
