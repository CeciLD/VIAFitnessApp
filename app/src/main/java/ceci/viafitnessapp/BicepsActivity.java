package ceci.viafitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class BicepsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.biceps);
                ArrayList<String> listWithExercises= new ArrayList<String>();
        listWithExercises.add("Incline Hammer Curls");
        listWithExercises.add("Wide-Grip Standing Barbell Curl");
        listWithExercises.add("Spider Curl");


        ArrayAdapter<String> exercisesAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listWithExercises);
ListView listViewExercises=(ListView) findViewById(R.id.listWithBicepsExcercises);
        listViewExercises.setAdapter(exercisesAdapter);
        listViewExercises.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        switch(position){
                            case 0:
                                Intent toInclinceHammerCurls = new Intent(BicepsActivity.this, InclineHammerCurlsActivity.class);
                                startActivity(toInclinceHammerCurls);
                                break;
                            case 1:
                                Intent toWideGripStandingBarbellCurl = new Intent(BicepsActivity.this, WideGripStandingBarbellCurlActivity.class);
                                startActivity(toWideGripStandingBarbellCurl);
                                break;
                            case 2:
                                Intent toSpiderCurl = new Intent(BicepsActivity.this, SpiderCurlActivity.class);
                                startActivity(toSpiderCurl);
                                break;
                            default:
                                break;

                        }

                    }
                });
    }
}
