package ceci.viafitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ExcerciseActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.excercises_main);

//        ArrayList<String> listWithExercises= new ArrayList<String>();
//        listWithExercises.add("Biceps");
//        listWithExercises.add("Triceps");
//        listWithExercises.add("chest");
//        listWithExercises.add("Shoulder");
//        listWithExercises.add("Back");
//        listWithExercises.add("Abs");
//        listWithExercises.add("Forearm");
//        listWithExercises.add("Upper leg");
//        listWithExercises.add("Glutes");
//        listWithExercises.add("Cardio");
//        listWithExercises.add("Lower leg");
//        ArrayAdapter<String> exercisesAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listWithExercises);
//ListView listViewExercises=(ListView) findViewById(R.id.listWithExcercises);
//        listViewExercises.setAdapter(exercisesAdapter);
final ArrayList<Exercise> exercisesList=new ArrayList<Exercise>();
exercisesList.add(new Exercise("Biceps", R.drawable.biceps));
        exercisesList.add(new Exercise("Triceps", R.drawable.triceps_new));
        exercisesList.add(new Exercise("Chest", R.drawable.chest));
        exercisesList.add(new Exercise("Shoulder", R.drawable.shoulder));
        exercisesList.add(new Exercise("Back", R.drawable.back));
        exercisesList.add(new Exercise("Abs", R.drawable.abs));
        exercisesList.add(new Exercise("Forearm", R.drawable.forearm));
        exercisesList.add(new Exercise("Upper leg", R.drawable.upper_leg));
        exercisesList.add(new Exercise("Glutes", R.drawable.glutes));
        exercisesList.add(new Exercise("Cardio", R.drawable.cardio));
        exercisesList.add(new Exercise("Lower leg", R.drawable.lower_leg));



ExcersiceAdapter excersiceAdapter=new ExcersiceAdapter(this,exercisesList);
ListView listView=(ListView)findViewById(R.id.listWithExercises);
listView.setAdapter(excersiceAdapter);

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                         switch(position){
                            case 0:
                                Intent toBiceps = new Intent(ExcerciseActivity.this, BicepsActivity.class);
                                startActivity(toBiceps);
                                break;
                            case 1:
                                Intent toTriceps = new Intent(ExcerciseActivity.this, TricepsActivity.class);
                                startActivity(toTriceps);
                                break;
                            case 2:
                                Intent toChest = new Intent(ExcerciseActivity.this, ChestActivity.class);
                                startActivity(toChest);
                                break;
                            case 3:
                                Intent toShoulder = new Intent(ExcerciseActivity.this, ShoulderActivity.class);
                                startActivity(toShoulder);
                                break;
                            case 4:
                                Intent toBack = new Intent(ExcerciseActivity.this, BackActivity.class);
                                startActivity(toBack);
                                break;
                            case 5:
                                Intent toAbs = new Intent(ExcerciseActivity.this, AbsActivity.class);
                                startActivity(toAbs);
                                break;
                            case 6:
                                Intent toForearm = new Intent(ExcerciseActivity.this, ForearmActivity.class);
                                startActivity(toForearm);
                                break;
                            case 7:
                                Intent toUpperLeg = new Intent(ExcerciseActivity.this, UpperLegActivity.class);
                                startActivity(toUpperLeg);
                                break;
                            case 8:
                                Intent toGlutes = new Intent(ExcerciseActivity.this, GlutesActivity.class);
                                startActivity(toGlutes);
                                break;
                            case 9:
                                Intent toCardio = new Intent(ExcerciseActivity.this, CardioActivity.class);
                                startActivity(toCardio);
                                break;
                            case 10:
                                Intent toLowerLeg = new Intent(ExcerciseActivity.this, LowerLegActivity.class);
                                startActivity(toLowerLeg);
                                break;
                            default:
                                break;

                        }

                    }
                });
    }
}
