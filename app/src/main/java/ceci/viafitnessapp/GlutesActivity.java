package ceci.viafitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class GlutesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.glutes);
        ArrayList<String> listWithExercises= new ArrayList<String>();
        listWithExercises.add("Barbell Glute Bridge");
        listWithExercises.add("Barbell Hip Thrust");
        listWithExercises.add("Single Leg Glute Bridge");



        ArrayAdapter<String> exercisesAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listWithExercises);
        ListView listViewExercises=(ListView) findViewById(R.id.listWithGlutesExc);
        listViewExercises.setAdapter(exercisesAdapter);
        listViewExercises.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        switch(position){
                            case 0:
                                Intent toBarbellGluteBridge = new Intent(GlutesActivity.this, BarbellGluteBridgeActivity.class);
                                startActivity(toBarbellGluteBridge);
                                break;
                            case 1:
                                Intent toBarbellHipThrust = new Intent(GlutesActivity.this, BarbellHipThrustActivity.class);
                            startActivity(toBarbellHipThrust);
                            break;
                            case 2:
                                Intent toSingleLegGluteBridge = new Intent(GlutesActivity.this,SingleLegGluteBridgeActivity.class);
                                startActivity(toSingleLegGluteBridge);
                                break;
                            default:
                                break;

                        }

                    }
                });
    }
}
