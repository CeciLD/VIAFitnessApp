package ceci.viafitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class LowerLegActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lower_leg);
        ArrayList<String> listWithExercises= new ArrayList<String>();
        listWithExercises.add("Smith Machine Calf Raise");
        listWithExercises.add("Standing Calf Raises");
        listWithExercises.add("Seated Calf Raise");


        ArrayAdapter<String> exercisesAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listWithExercises);
        ListView listViewExercises=(ListView) findViewById(R.id.listWithLowerLegExc);
        listViewExercises.setAdapter(exercisesAdapter);
        listViewExercises.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        switch(position){
                            case 0:
                                Intent toSmithMachineCalfRaise = new Intent(LowerLegActivity.this, SmithMachineCalfRaiseActivity.class);
                                startActivity(toSmithMachineCalfRaise);
                                break;
                            case 1:
                                Intent toStandingCalfRaises = new Intent(LowerLegActivity.this, StandingCalfRaisesActivity.class);
                                startActivity(toStandingCalfRaises);
                                break;
                            case 2:
                                Intent toSeatedCalfRaises = new Intent(LowerLegActivity.this, SeatedCalfRaiseActivity.class);
                                startActivity(toSeatedCalfRaises);
                                break;
                            default:
                                break;

                        }

                    }
                });
    }
}
