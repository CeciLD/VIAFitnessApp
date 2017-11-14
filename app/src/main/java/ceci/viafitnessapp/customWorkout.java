package ceci.viafitnessapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class CustomWorkout extends AppCompatActivity {

        ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_workout);
        imageButton = (ImageButton) findViewById(R.id.imageButton);
    }
    public void onClick(View v) {

    }
}
