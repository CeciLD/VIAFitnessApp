package ceci.viafitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class CardioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cardio);        ArrayList<String> listWithExercises= new ArrayList<String>();
        listWithExercises.add("Rope Jumping");
        listWithExercises.add("Step Mill");
        listWithExercises.add("Bicycling");



        ArrayAdapter<String> exercisesAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listWithExercises);
        ListView listViewExercises=(ListView) findViewById(R.id.listWithCardioExc);
        listViewExercises.setAdapter(exercisesAdapter);
        listViewExercises.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        switch(position){
                            case 0:
                                Intent toRopeJumping = new Intent(CardioActivity.this, RopeJumpingActivity.class);
                                startActivity(toRopeJumping);
                                break;
                            case 1:
                                Intent toStepMill = new Intent(CardioActivity.this, StepMillActivity.class);
                                startActivity(toStepMill);
                                break;
                            case 2:
                                Intent toBicycling = new Intent(CardioActivity.this, BicyclingActivity.class);
                                startActivity(toBicycling);
                                break;
                            default:
                                break;

                        }

                    }
                });
    }
}
