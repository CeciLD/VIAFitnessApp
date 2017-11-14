package ceci.viafitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class AbsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abs);
        ArrayList<String> listWithExercises= new ArrayList<String>();
        listWithExercises.add("One-Arm Medicine Ball Slam");
        listWithExercises.add("Landmine 180's");
        listWithExercises.add("Suspended Fallout");


        ArrayAdapter<String> exercisesAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listWithExercises);
        ListView listViewExercises=(ListView) findViewById(R.id.listWithAbsExc);
        listViewExercises.setAdapter(exercisesAdapter);
        listViewExercises.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        switch(position){
                            case 0:
                                Intent toOneArmMedicineBallSlam = new Intent(AbsActivity.this, OneArmMedicineBallActivity.class);
                                startActivity(toOneArmMedicineBallSlam);
                                break;
                            case 1:
                                Intent toLandmine180s = new Intent(AbsActivity.this, Landmine180sActivity.class);
                                startActivity(toLandmine180s);
                                break;
                            case 2:
                                Intent toSupendedFallout = new Intent(AbsActivity.this, SuspendedFalloutActivity.class);
                                startActivity(toSupendedFallout);
                                break;
                            default:
                                break;

                        }

                    }
                });
    }
}
