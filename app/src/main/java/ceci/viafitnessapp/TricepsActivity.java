package ceci.viafitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class TricepsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.triceps);
        ArrayList<String> listWithExercises= new ArrayList<String>();
        listWithExercises.add("Dips - Triceps Version");
        listWithExercises.add("Decline EZ Bar Triceps Extension");
        listWithExercises.add("Dumbbell Floor Press");


        ArrayAdapter<String> exercisesAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listWithExercises);
        ListView listViewExercises=(ListView) findViewById(R.id.listWithTricepsExercises);
        listViewExercises.setAdapter(exercisesAdapter);
        listViewExercises.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        switch(position){
                            case 0:
                                Intent toDipsTricepsVersion = new Intent(TricepsActivity.this, DipsTricepsVersionActivity.class);
                                startActivity(toDipsTricepsVersion);
                                break;
                            case 1:
                                Intent toDeclineEZBarTricepsExtension = new Intent(TricepsActivity.this, DeclineEzBarTricepsExtensionActivity.class);
                                startActivity(toDeclineEZBarTricepsExtension);
                                break;
                            case 2:
                                Intent toDummbellFloorPress = new Intent(TricepsActivity.this, DumbellFloorPressActivity.class);
                                startActivity(toDummbellFloorPress);
                                break;
                            default:
                                break;

                        }

                    }
                });
    }
}
