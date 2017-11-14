package ceci.viafitnessapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Asus on 6.11.2017 г..
 */

public class ExcersiceAdapter extends ArrayAdapter<Exercise> {
    public ExcersiceAdapter(Activity content, ArrayList<Exercise> exercises){
        super(content,0,exercises);
    }
    @Override
    public View getView(int position, View convertView,ViewGroup parent) {
View listItemView=convertView;
if(listItemView==null){
    listItemView = LayoutInflater.from(getContext()).inflate(R.layout.excercises_main, parent, false);
}
Exercise currentExercise=getItem(position);

        ImageView icon=(ImageView)listItemView.findViewById(R.id.icon1);
        icon.setImageResource(currentExercise.getResourseID());
        TextView name=(TextView) listItemView.findViewById(R.id.name);
        name.setText(currentExercise.getName());
return listItemView;
    }



}

