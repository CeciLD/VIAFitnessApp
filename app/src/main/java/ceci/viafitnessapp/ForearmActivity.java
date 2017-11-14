package ceci.viafitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ForearmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forearm);
        ArrayList<String> listWithExercises= new ArrayList<String>();
        listWithExercises.add("Rickshaw Carry");
        listWithExercises.add("Wrist Rotations with Straight Bar");
        listWithExercises.add("Palms-Down Wrist Curl Over A Bench");



        ArrayAdapter<String> exercisesAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listWithExercises);
        ListView listViewExercises=(ListView) findViewById(R.id.listWithForearmExc);
        listViewExercises.setAdapter(exercisesAdapter);
        listViewExercises.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        switch(position){
                            case 0:
                                Intent toRickshawCarry = new Intent(ForearmActivity.this, RickshawCarryActivity.class);
                                startActivity(toRickshawCarry);
                                break;
                            case 1:
                                Intent toWristRotations = new Intent(ForearmActivity.this, WristRotationsWithStraightBarActivity.class);
                                startActivity(toWristRotations);
                                break;
                            case 2:
                                Intent toPalmsDownWristCurlOverABench = new Intent(ForearmActivity.this, PalmsDownWristCurlOverABenchActivity.class);
                                startActivity(toPalmsDownWristCurlOverABench);
                                break;
                            default:
                                break;

                        }

                    }
                });
    }
}
