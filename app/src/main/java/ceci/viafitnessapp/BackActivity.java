package ceci.viafitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class
BackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.back);
        ArrayList<String> listWithExercises= new ArrayList<String>();
        listWithExercises.add("Weighted Pull Ups");
        listWithExercises.add("One-Arm Long Bar Row");
        listWithExercises.add("Bent Over One-Arm Long Bar Row");



        ArrayAdapter<String> exercisesAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listWithExercises);
        ListView listViewExercises=(ListView) findViewById(R.id.listWithBackExc);
        listViewExercises.setAdapter(exercisesAdapter);
        listViewExercises.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        switch(position){
                            case 0:
                                Intent toWeightedPullUps = new Intent(BackActivity.this, WeightedPullUpsActivity.class);
                                startActivity(toWeightedPullUps);
                                break;
                            case 1:
                                Intent toOneArmLongBarRow = new Intent(BackActivity.this, OneArmLongBarRowActivity.class);
                                startActivity(toOneArmLongBarRow);
                                break;
                            case 2:
                                Intent toBentOverOneArmLongBarRow = new Intent(BackActivity.this, BentOverOneArmLongBarRowActivity.class);
                                startActivity(toBentOverOneArmLongBarRow);
                                break;
                            default:
                                break;

                        }

                    }
                });
    }
}
