package ceci.viafitnessapp;

import android.app.Notification;
import android.app.NotificationManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;

public class Calculator extends AppCompatActivity {
//SOMETHING
    EditText weight;
    EditText height;
    EditText age;
    Switch gender;
    Button button;
    EditText result;
    double agee;
    private final static String CALORIES = "kcal";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        weight = (EditText) findViewById(R.id.editText);
        height = (EditText) findViewById(R.id.editText2);
        age = (EditText) findViewById(R.id.editText3);
        button = (Button) findViewById(R.id.calculate);
        result = (EditText) findViewById(R.id.resultNumber);
        gender = (Switch) findViewById(R.id.switch3);

    }

    public void onClick(View v) {
        if (weight.getText().toString().isEmpty() || height.getText().toString().isEmpty() || age.getText().toString().isEmpty()) {

        } else
                if(!gender.isChecked()) {

                    agee = Integer.parseInt(age.getText().toString());
                    double bmi = 66.4730 + (13.7516 * Integer.valueOf(weight.getText().toString())) + (5.0033 * Integer.valueOf(height.getText().toString())) - (6.7550 * Integer.valueOf(age.getText().toString()));
                    result.setText(String.valueOf(bmi));
                }else{
                    double bmi = 655.0955 + (9.5634 * Integer.valueOf(weight.getText().toString())) + (1.849 * Integer.valueOf(height.getText().toString())) - (4.6756  * Integer.valueOf(age.getText().toString()));
                    result.setText(String.valueOf(bmi));
                }


    }

}
