package ceci.viafitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ChestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chest);ArrayList<String> listWithExercises= new ArrayList<String>();
        listWithExercises.add("Dumbbell Bench Press");
        listWithExercises.add("Pushups");
        listWithExercises.add("Dumbbell Flyes");


        ArrayAdapter<String> exercisesAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listWithExercises);
        ListView listViewExercises=(ListView) findViewById(R.id.listWithChestExc);
        listViewExercises.setAdapter(exercisesAdapter);
        listViewExercises.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        switch(position){
                            case 0:
                                Intent toDumbellBenchPress = new Intent(ChestActivity.this, DumbelBenchPressActivity.class);
                                startActivity(toDumbellBenchPress);
                                break;
                            case 1:
                                Intent toPushups = new Intent(ChestActivity.this, PushupsActivity.class);
                                startActivity(toPushups);
                                break;
                            case 2:
                                Intent toDumbbellFlyes = new Intent(ChestActivity.this, DumbellFlyesActivity.class);
                                startActivity(toDumbbellFlyes);
                                break;
                            default:
                                break;

                        }

                    }
                });
    }
}
