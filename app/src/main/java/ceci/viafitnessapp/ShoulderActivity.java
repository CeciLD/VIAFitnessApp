package ceci.viafitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ShoulderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shoulder);
        ArrayList<String> listWithExercises= new ArrayList<String>();
        listWithExercises.add("Single-Arm Linear Jammer");
        listWithExercises.add("Side Laterals to Front Raise");
        listWithExercises.add("Standing Palm-In One-Arm Dumbbell Press");



        ArrayAdapter<String> exercisesAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listWithExercises);
        ListView listViewExercises=(ListView) findViewById(R.id.listWithShoulderExc);
        listViewExercises.setAdapter(exercisesAdapter);
        listViewExercises.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        switch(position){
                            case 0:
                                Intent toSingleArmLinearJammer = new Intent(ShoulderActivity.this, SingleArmLinearJammerActivity.class);
                                startActivity(toSingleArmLinearJammer);
                                break;
                            case 1:
                                Intent toSideLateralsToFrontRaise = new Intent(ShoulderActivity.this, SideLatersToFrontRaiseActivity.class);
                                startActivity(toSideLateralsToFrontRaise);
                                break;
                            case 2:
                                Intent toStandingPalmInOneArmDumbbellPress = new Intent(ShoulderActivity.this, StandingPalmOnOneArmDumbellPressActivity.class);
                                startActivity(toStandingPalmInOneArmDumbbellPress);
                                break;
                            default:
                                break;

                        }

                    }
                });
    }
}
