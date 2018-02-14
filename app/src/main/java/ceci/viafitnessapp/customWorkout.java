package ceci.viafitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

    public void onClickButton(View v) {
        Intent intent = new Intent(CustomWorkout.this, Workout.class);
        startActivity(intent);
    }
}
