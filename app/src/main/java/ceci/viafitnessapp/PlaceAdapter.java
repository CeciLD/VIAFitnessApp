package ceci.viafitnessapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by lenovo on 11-Sep-17.
 */

class PlaceAdapter extends ArrayAdapter<Diets> {
    Context mContext;
    int mLayoutResourceId;
    Diets mData[] = null;

    public PlaceAdapter(Context context, ArrayList<Diets> objects) {
        super(context, 0, objects);
    }


    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        if (row == null) {
            row = LayoutInflater.from(getContext()).inflate(R.layout.row, parent, false);
        }

        TextView nameView = (TextView) row.findViewById(R.id.nameTextView);
        TextView nameView2 = (TextView) row.findViewById(R.id.type);
        ImageView imageView = (ImageView) row.findViewById(R.id.imageView);

        Diets diets = getItem(position);

        nameView2.setText(diets.getType());
        nameView.setText(diets.getName());


        imageView.setImageResource(diets.getIdOfTheImage());


        return row;

    }
}
