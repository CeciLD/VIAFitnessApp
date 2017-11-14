package ceci.viafitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class UpperLegActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.upper_leg);        ArrayList<String> listWithExercises= new ArrayList<String>();
        listWithExercises.add("Single-Leg Press");
        listWithExercises.add("Clean from Blocks");
        listWithExercises.add("Barbell Full Squat");



        ArrayAdapter<String> exercisesAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listWithExercises);
        ListView listViewExercises=(ListView) findViewById(R.id.listWithUpperLegExc);
        listViewExercises.setAdapter(exercisesAdapter);
        listViewExercises.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        switch(position){
                            case 0:
                                Intent toSingleLegPress = new Intent(UpperLegActivity.this, SingleLegPressActivity.class);
                                startActivity(toSingleLegPress);
                                break;
                            case 1:
                                Intent toCleanFromBlocks = new Intent(UpperLegActivity.this, CleanFromBlocksActivity.class);
                                startActivity(toCleanFromBlocks);
                                break;
                            case 2:
                                Intent toBarbellFullSquat = new Intent(UpperLegActivity.this, BarbellFullSquatActivity.class);
                                startActivity(toBarbellFullSquat);
                                break;
                            default:
                                break;

                        }

                    }
                });
    }
}
